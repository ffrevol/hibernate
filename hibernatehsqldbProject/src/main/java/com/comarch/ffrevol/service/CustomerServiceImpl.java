package com.comarch.ffrevol.service;



import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.comarch.ffrevol.dao.CustomerDao;
import com.comarch.ffrevol.model.Customer;


/**
 * Implements the business methods for the customer service
 * @author shaines
 */
@Service( "customerService" )
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer findById( long id )
    {
        return customerDao.findById( id );
    }

    @Override
    public List<Customer> findAll()
    {
        return customerDao.findAll();
    }

    @Override
    public void save( Customer customer )
    {
        customerDao.save( customer );
    }

    @Override
    public void update( Customer customer )
    {
        customerDao.update( customer );
    }

    @Override
    public void delete( Customer customer )
    {
        customerDao.delete( customer );
    }

    @Override
    public void shutdown()
    {
        customerDao.shutdown();
    }
}