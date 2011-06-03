package com.comarch.ffrevol.dao;


import java.util.List;
import com.comarch.ffrevol.model.Customer;

/**
 * Defines the data access methods for Customer persistence
 *
 * @author shaines
 */
public interface CustomerDao
{
    public Customer findById( long id );
    public List<Customer> findAll();
    public void save( Customer customer );
    public void update( Customer customer );
    public void delete( Customer customer );
    public void shutdown();
}