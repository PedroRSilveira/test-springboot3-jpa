package com.pedrosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosilveira.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}