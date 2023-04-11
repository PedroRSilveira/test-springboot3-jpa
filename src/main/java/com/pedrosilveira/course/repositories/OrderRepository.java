package com.pedrosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosilveira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}