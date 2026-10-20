package com.Veracity.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veracity.Entities.User;
import com.Veracity.Repositories.CrudRepository;
import com.Veracity.Repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CrudRepository crudRepository;
	@Override
	public User CreateUser(User user) {
		return userRepository.save(user);
		
	}
	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}
	@Override
	public Optional<User> userById(int Id) throws Exception {
		
		return userRepository.findById(Id);
	}
	@Override
	public Optional<User> deleteUserById(int Id) throws Exception {
		Optional<User> user = crudRepository.findById(Id);
		crudRepository.deleteById(Id);
		return user;
	}
	
	
	
	
	
	
	
	
}
