package com.pedrosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosilveira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}