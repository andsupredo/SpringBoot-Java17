package com.anderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
