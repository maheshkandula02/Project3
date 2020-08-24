package com.demo.service;

import java.util.List;

import com.demo.exception.BusinessException;
import com.demo.model.User;

public interface UserService {
public User authenticate(String userid, String password);
public User addUser(User user);
public User updateUser(User user);
public User getUserById(int id) throws BusinessException;
public void deleteUserById(int id);
public List<User> getAllUsers();
public List<User> getAllUsersByAge(int age);
}