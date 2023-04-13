package com.pedrosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosilveira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}