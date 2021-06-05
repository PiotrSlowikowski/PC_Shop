package pl.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.company.dao.CustomerDao;
import pl.company.model.Customer;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {


    @Autowired
    private CustomerDao customerDao;


    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String partsList(Model model) {
        model.addAttribute("customers", customerDao.findAll());
        return "/page/customersList";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateCart(Model model, @PathVariable int id) {
        Customer customer = customerDao.findById(id); //wypelnianie wartosciami
        model.addAttribute("customer", customer);
        return "/page/editCustomer";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String updateCart(@PathVariable int id, @ModelAttribute Customer customer) {
        customerDao.update(customer);
        return "Customer with ID: "+id+ " has been edited.";
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String deleteCustomer(@PathVariable int id) {
        customerDao.delete(id);
        return "Customer with ID: "+id+ " has been deleted.";
    }









}

//zamiast zly user zle haslo przekierowanie do tego widoku