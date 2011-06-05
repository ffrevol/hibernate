package com.comarch.ffrevol;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comarch.ffrevol.dao.LibraryDAO;
import com.comarch.ffrevol.model.Student;


public class LibraryDAOTest {
	/**
     * Logger for debugging purposes
     */
    private Logger logger = Logger.getLogger( LibraryDAOTest.class );
    
    /**
     * A Spring application context that we'll create from a test application context and use to create
     * our DAO object (and data source, session factory, etc.)
     */
    private static ApplicationContext ctx = null;
    
    /**
     * The CustomerDao that we'll be testing
     */
    private LibraryDAO dao;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        // Load the applicationContext.xml file
        ctx = new ClassPathXmlApplicationContext( "applicationStudentContext.xml" );
    }
    
    @Before
    public void setUp()
    {
        dao = ( LibraryDAO )ctx.getBean( "dao" );
    }
    
    @After
    public void tearDown()
    {
        dao = null;
    }
    
    @Test
	public void testGetStudent() throws Exception {
    	int id = 1;
		Student student = dao.getStudent(id);
		assertEquals("Fred",student.getName());
	}
}
