package com.danielkrieger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielkrieger.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
