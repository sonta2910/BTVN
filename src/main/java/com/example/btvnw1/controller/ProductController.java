package com.example.btvnw1.controller;

import com.example.btvnw1.model.Product;
import com.example.btvnw1.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    private ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    private ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/createProduct")
    private String createProduct(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/update/{id}")
    private ModelAndView update(@PathVariable Long id) {
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    private String delete(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/products";
    }

}
