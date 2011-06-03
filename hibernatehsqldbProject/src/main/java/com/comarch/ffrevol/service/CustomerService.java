package com.comarch.ffrevol.service;


import java.util.List;

import com.comarch.ffrevol.model.Customer;

/**
 * Defines the business methods for the customer service
 *
 * @author shaines
 */
public interface CustomerService
{
    public Customer findById( long id );
    public List<Customer> findAll();
    public void save( Customer customer );
    public void update( Customer customer );
    public void delete( Customer customer );
    public void shutdown();
}
