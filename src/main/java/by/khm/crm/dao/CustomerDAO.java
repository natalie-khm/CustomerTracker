package by.khm.crm.dao;

import by.khm.crm.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);
}
