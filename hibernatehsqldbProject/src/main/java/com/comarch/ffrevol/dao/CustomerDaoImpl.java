package com.comarch.ffrevol.dao;


import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import com.comarch.ffrevol.model.Customer;

/**
 * Implements the data access methods for Customer persistence
 *
 * @author shaines
 */

@Repository( "customerDao" )
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao
{
    @Override
    public Customer findById( long id )
    {
        return ( Customer )getHibernateTemplate().get( Customer.class, id );
    }

    @Override
    public List<Customer> findAll()
    {
        return getHibernateTemplate().find( "from com.comarch.ffrevol.model.Customer" );
    }

    @Override
    public void save( Customer customer )
    {
        getHibernateTemplate().save( customer );
    }

    @Override
    public void update( Customer customer )
    {
        getHibernateTemplate().update( customer );
    }

    @Override
    public void delete( Customer customer )
    {
        getHibernateTemplate().delete( customer );
    }

    @Override
    public void shutdown()
    {
        getHibernateTemplate().getSessionFactory().openSession().createSQLQuery( "SHUTDOWN" ).executeUpdate();
    }

    @Autowired
    public void init( SessionFactory sessionFactory )
    {
        setSessionFactory( sessionFactory );
    }
}