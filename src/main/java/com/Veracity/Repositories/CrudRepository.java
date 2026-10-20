package com.Veracity.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Veracity.Entities.User;

public interface CrudRepository extends JpaRepository<User,Integer> {

}
