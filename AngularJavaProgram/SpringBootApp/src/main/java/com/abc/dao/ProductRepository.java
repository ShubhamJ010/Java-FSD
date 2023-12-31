package com.abc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
