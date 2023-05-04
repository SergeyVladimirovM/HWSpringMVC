package com.example.hw.controller;

import com.example.hw.POJO.Product;
import com.example.hw.repository.ProductRepository;
import com.example.hw.repository.ProductRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    private final ProductRepository productRepository = new ProductRepositoryImpl();

    @GetMapping("/")
    public ModelAndView allProducts() {
        List<Product> productList = productRepository.productAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("products");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView findProductByIdPage(@ModelAttribute("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/getById/{id}");
        return modelAndView;
    }

    @GetMapping("/getById/{id}")
    public ModelAndView findProductById(@PathVariable Long id) {
        Product product = productRepository.findProductById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("findById");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/addProduct")
    public ModelAndView addProductPage() {
        Product product = new Product();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addProduct");
        modelAndView.addObject(product);
        return modelAndView;
    }

    @PostMapping("/addProduct")
    public ModelAndView addProduct(@ModelAttribute("product") Product product) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        productRepository.addProduct(product);
        return modelAndView;
    }
}
