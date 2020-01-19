package by.khm.crm.service;

import by.khm.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveCustomer(Customer customer);
}
