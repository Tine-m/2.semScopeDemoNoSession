package com.example.scopedemo.controllers;

import com.example.scopedemo.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    //page counter
    private int counter = 0;
    private List<Product> basket = new ArrayList<>();

    @GetMapping("/")
    public String pageController(Model model) {
        //increase pager counter
        counter++;
        model.addAttribute("counter", counter);
        model.addAttribute("basket", basket);
        return "main";
    }

    @GetMapping("/newProduct")
    public String addProduct(Model model) {
        model.addAttribute("products", null);
        return "productForm";
    }

    @PostMapping("/addToBasket")
    public String bookList(HttpServletRequest request) {
        String param1 = request.getParameter("description");
        String param2 = request.getParameter("quantity");
        Product product = new Product(param1, Integer.parseInt(param2));
        basket.add(product);
        return"redirect:/";
    }
}
