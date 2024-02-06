package com.infinite.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.infinite.model.User;

 //Responsible for database interactions
public interface UserService extends JpaRepository<User, Long> {
	User findByUsername(Long username);

	User findByPassword(String password);

	User findByUsernameAndPassword(String username, String password);
}
