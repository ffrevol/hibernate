package com.comarch.ffrevol;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comarch.ffrevol.model.Customer;
import com.comarch.ffrevol.service.CustomerService;;

/**
 * Sample application that demonstrates how to build an application context from
 * an XML file in the CLASSPATH and then access its beans.
 *
 * @author shaines
 */
public class SpringHibernateExample
{
    private static ApplicationContext applicationContext;
    private static CustomerService customerService;

    public static void showCustomers()
    {
        List<Customer> customers = customerService.findAll();
        System.out.println( "Customers:" );
        for( Customer customer : customers )
        {
            System.out.println( "\t" + customer.getEmail() );
        }
    }

    public static void addUser( String firstName, String lastName, String email, String password )
    {
        customerService.save( new Customer( firstName, lastName, email, password ) );
    }

    public static void shutdown()
    {
        customerService.shutdown();
    }

    public static void main( String[] args )
    {
    	BasicConfigurator.configure(); 
    	
        // Load the application context
        applicationContext = new ClassPathXmlApplicationContext( "classpath:applicationContext.xml" );

        // Load our customer service bean
        customerService = ( CustomerService )applicationContext.getBean( "customerService" );

        // Test code
        showCustomers();
        addUser( "Michael", "Haines", "michael@javasrc.com", "funkey" );
        showCustomers();
        shutdown();
    }
}