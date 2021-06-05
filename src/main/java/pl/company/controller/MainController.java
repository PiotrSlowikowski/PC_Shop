package pl.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.company.dao.CartDao;
import pl.company.dao.CustomerDao;
import pl.company.dao.PartDao;
import pl.company.model.Cart;
import pl.company.model.Customer;
import pl.company.model.Part;


@Controller
@RequestMapping(path = "/main")
public class MainController {

    @Autowired
    private PartDao partDao;

    @Autowired
    private CartDao cartDao;

    @Autowired
    private CustomerDao customerDao;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String partsList(Model model) {
        model.addAttribute("parts", partDao.findAll());
        return "/page/index";
    }

    @RequestMapping(value = "/allincart", method = RequestMethod.GET)
    public String cartList(Model model) {
        model.addAttribute("carts", cartDao.findAll());
        return "/page/cartList";
    }



    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addToCart(Model model) {
        model.addAttribute("cart", new Cart());
        return "/page/addToCart";
    }

    @PostMapping("/add")
    @ResponseBody
    public String saveCart(Cart cart) {
            cartDao.saveCart(cart);
        return "Product has been added to shopping cart.";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateCart(Model model, @PathVariable int id) {
        Cart cart = cartDao.findById(id); //wypelnianie wartosciami
        model.addAttribute("cart", cart);
        return "/page/editCart";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String updateCart(@PathVariable int id, @ModelAttribute Cart cart) {
        cartDao.update(cart);
        return "Cart item has been edited with id: " + id;
    }

    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String saveToCart(Model model, @PathVariable int id) {
        Part part = partDao.findById(id); //wypelnianie wartosciami
        model.addAttribute("part", part);
        return "/page/addToCart";
    }

//     Nie dziala
    @RequestMapping(value = "/add/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String saveToCart(@PathVariable int id, @ModelAttribute Part part) {
        partDao.savePart(part);
        return "Cart item has been saved with id: " + id;
    }



    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable int id) {
        cartDao.delete(id);
        return "Part with ID: "+id+" has been deleted.";
    }

    @RequestMapping(value = "/orderForm", method = RequestMethod.GET)
    public String orderForm(Model model) {
        model.addAttribute("carts", cartDao.findAll());
        return "/page/orderForm";
    }

    @RequestMapping(value = "/customerDataAdd", method = RequestMethod.GET)
    public String addCustomerData(Model model) {
        model.addAttribute("customer", new Customer());
        return "/page/customerDataAdd";
    }

    @PostMapping("/customerDataAdd")
    @ResponseBody
    public String addCustomerData(Customer customer) {
        customerDao.saveCustomer(customer);
        return "Order has been finished. <br>" +
                "<a href=\"/admin/customers\">Admin Panel</a>";
    }


}
