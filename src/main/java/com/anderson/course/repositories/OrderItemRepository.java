package com.anderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.course.entities.OrderItem;
import com.anderson.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
