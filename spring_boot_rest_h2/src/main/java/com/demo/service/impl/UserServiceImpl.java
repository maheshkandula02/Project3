package com.demo.service.impl;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserRepository;
import com.demo.exception.BusinessException;
import com.demo.model.User;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository dao;

	@Override
	public User authenticate(String userid, String password) {
		// 
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public User getUserById(int id) throws BusinessException {
		if(id<=0) {
			throw new BusinessException("Entered id "+id+"is in valid");
		}
		
		User user=null;
		try {
			user=dao.findById(id).get();
			
		}catch(NoSuchElementException e) {
			throw new BusinessException("No User found "+id);
		
	}
		return user;
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<User> getAllUsersByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}