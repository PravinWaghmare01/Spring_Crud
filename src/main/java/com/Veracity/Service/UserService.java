package com.Veracity.Service;

import java.util.List;
import java.util.Optional;

import com.Veracity.Entities.User;

public interface UserService  {

	public User CreateUser(User user);
	
	public List<User> getAllUser();
	
	public Optional<User> userById(int Id) throws Exception;
	
	
}
