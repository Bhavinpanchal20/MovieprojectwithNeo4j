package com.movieneo4j.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieneo4j.entity.Users;
import com.movieneo4j.repository.UserRepository;
import com.movieneo4j.service.UserServices;
@Service
@Transactional
public class UserServiceImp implements UserServices{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void signUp(Users user) {
		userRepository.save(user);
	}

	@Override
	public List<Users> findAll() {
		 return userRepository.findAll();
	}

	@Override
	public List<Users> getALL() {
		return userRepository.findAll();
	}

	@Override
	public void insertNewRole(Users u) {
		
		userRepository.save(u);
	}
}
