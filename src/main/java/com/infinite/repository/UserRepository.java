package com.infinite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.model.User;

@Repository //Responsible for database interactions
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(Long username);

	User findByPassword(String password);

	User findByUsernameAndPassword(Long username, String password);
}
