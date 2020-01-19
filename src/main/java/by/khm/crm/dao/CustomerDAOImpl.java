package by.khm.crm.dao;

import by.khm.crm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();
        Query<Customer> customerListQuery = session.createQuery("from Customer order by lastName", Customer.class);
        List<Customer> customers = customerListQuery.getResultList();
        return customers;
    }

    @Override
    public Customer getCustomer(int id) {

        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    @Override
    public void saveCustomer(Customer customer) {

        System.out.println("Run saveCustomer");
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public void deleteCustomer(int id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Customer> deleteQuery = session.createQuery("delete from Customer c where c.id = :customerId");
        deleteQuery.setParameter("customerId", id);
        deleteQuery.executeUpdate();
    }

    @Override
    public List<Customer> getCustomersByFirstOrLastName(String searchName) {

        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query;

        if (searchName != null && searchName.trim().length() > 0) {
            query = session.createQuery("from Customer c where lower(c.firstName) like :searchName " +
                    "or lower(lastName) like :searchName");
            query.setParameter("searchName", "%" + searchName.toLowerCase() + "%");
        } else {
            query = session.createQuery("from Customer", Customer.class);
        }

        List<Customer> customers = query.getResultList();

        return customers;
    }
}
