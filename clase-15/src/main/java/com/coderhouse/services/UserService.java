package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.apis.UserRestApi;
import com.coderhouse.interfaces.UserRestInterface;
import com.coderhouse.models.User;

@Service
public class UserService implements UserRestInterface{

	@Autowired
	private UserRestApi userRestApi;
	
	@Override
	public List<User> getAllUsers() {		
		return userRestApi.getAllUsers();
	}

	@Override
	public User getUserById(String id) {
		return userRestApi.getUserById(id);
	}

	@Override
	public User addUser(User user) {
		return userRestApi.addUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userRestApi.updateUser(user);
	}

	@Override
	public void deleteUser(String id) {
		userRestApi.deleteUser(id);
	}

}