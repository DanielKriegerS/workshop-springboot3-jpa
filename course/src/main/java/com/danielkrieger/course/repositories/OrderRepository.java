package com.danielkrieger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielkrieger.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
