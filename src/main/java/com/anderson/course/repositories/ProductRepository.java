package com.anderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
