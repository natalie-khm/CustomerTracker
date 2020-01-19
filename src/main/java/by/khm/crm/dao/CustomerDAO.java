package by.khm.crm.dao;

import by.khm.crm.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
    List<Customer> getCustomersByFirstOrLastName(String searchName);
}
