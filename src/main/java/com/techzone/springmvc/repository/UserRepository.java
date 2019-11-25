package com.techzone.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techzone.springmvc.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer> {
	
	User findByUsername(String username);
	
	User findByEmail(String email);

}