package com.demo.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.*;
 
@RestController
public class UserController{

	@Autowired
	private UserService service;


	public User authenticate(String userid, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
	
		return service.addUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		
		return service.updateUser(user);
	}

    @GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		
		return service.getUserById(id);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable int id) {
		
		
	}

    @GetMapping("/users")
	public List<User> getAllUsers() {
		
		return service.getAllUsers();
	}
	public List<User> getAllUsersByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	
}
