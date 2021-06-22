package com.movieneo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieneo4j.entity.Users;
import com.movieneo4j.service.UserServices;

@RestController
public class RoledataController {
		@Autowired
		UserServices uservice;
		
		@GetMapping("/showall")
		public List<Users> getAll(){
			return uservice.findAll();
		}
		
		@PostMapping("/addnew")
		public void addNew(@RequestBody Users u) {
			uservice.insertNewRole(u);
		}
		
}
