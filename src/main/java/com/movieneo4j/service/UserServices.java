package com.movieneo4j.service;

import java.util.List;


import com.movieneo4j.entity.Users;



public interface UserServices {

	void signUp(Users user);
	List<Users> findAll();
	List<Users> getALL();
	void insertNewRole(Users u);
}
