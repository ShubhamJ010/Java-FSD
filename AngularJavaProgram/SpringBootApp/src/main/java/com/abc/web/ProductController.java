package com.abc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ProductService.ProductServices;
import com.abc.entities.Product;

@RestController
@RequestMapping("/Product")
@CrossOrigin("http://localhost:4200/")
public class ProductController {

    @Autowired
    ProductServices services;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product p) {
        return services.addProduct(p);
    }

    @GetMapping("/all")
    public List<Product> getAllProduct() {
        return services.getAllproduct();
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world!";
    }
}
