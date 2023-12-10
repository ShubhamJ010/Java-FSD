package com.abc.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.ProductRepository;
import com.abc.entities.Product;

@Service
public class ProductServices {

	@Autowired
    ProductRepository dao;

    public List<Product> getAllproduct() {
        return dao.findAll();
    }

    public Product addProduct(Product p) {
        return dao.save(p);
    }

}
