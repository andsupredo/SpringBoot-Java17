package com.anderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
