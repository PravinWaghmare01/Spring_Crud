package com.Veracity.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Veracity.Entities.User;
import com.Veracity.Repositories.UserRepository;
import com.Veracity.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public User CreateUser(@RequestBody User user) {
		
		return userService.CreateUser(user);
		
	}
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		
		return userService.getAllUser();
	}
	@GetMapping("/getUserById/{Id}")
	public Optional<User> userById(@PathVariable int Id) throws Exception {
		return userService.userById(Id);
				
	}

}
