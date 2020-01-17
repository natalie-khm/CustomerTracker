package by.khm.crm.controller;

import by.khm.crm.dao.CustomerDAO;
import by.khm.crm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String list(Model model) {

        List<Customer> customers = customerDAO.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }
}
