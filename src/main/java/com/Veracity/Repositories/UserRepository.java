package com.Veracity.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Veracity.Entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	
	
}
