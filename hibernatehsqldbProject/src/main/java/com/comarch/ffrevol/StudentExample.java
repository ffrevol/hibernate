package com.comarch.ffrevol;

import java.util.Set;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comarch.ffrevol.model.Book;
import com.comarch.ffrevol.model.Student;
import com.comarch.ffrevol.service.StudentService;

public class StudentExample {
	 private static ClassPathXmlApplicationContext applicationContext;
	private static StudentService studentService;

	private static Logger logger = Logger.getLogger("StudentExample");
	 
	public static void main( String[] args )
	    {
	    	BasicConfigurator.configure(); 
	    	
	        // Load the application context
	        applicationContext = new ClassPathXmlApplicationContext( "classpath:applicationStudentContext.xml" );

	        // Load our customer service bean
	        studentService = ( StudentService )applicationContext.getBean( "studentService" );

	        // Test code
	        Student student = studentService.getStudent(1);	        	        
	        logger.warning("Mr " + student.getName() + " has id = 1"  );
	    }
}
