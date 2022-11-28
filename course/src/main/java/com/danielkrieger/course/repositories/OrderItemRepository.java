package com.danielkrieger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielkrieger.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
