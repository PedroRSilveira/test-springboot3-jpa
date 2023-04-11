package com.pedrosilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosilveira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}