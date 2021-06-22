package com.movieneo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.movieneo4j.entity.Users;
import com.movieneo4j.service.UserServices;




@Controller
public class MainRoleController {
		
	@Autowired
	private UserServices userServices;
	@Autowired
	private PasswordEncoder passwordEncoder;
		
	@RequestMapping(value="/login2")
	public String indexPage() {
		return "login";
	}
	@RequestMapping(value="/")
	public String newindex() {
		return "indexpage";
	}
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/indextheatre")
	public String indexTheatre() {
		return "indextheatrepage";
	}
	@RequestMapping(value="/indexmovies")
	public String indexMovies() {
		return "indexpage";
	}
	@RequestMapping(value="/adminHome")
	public String getAdminHome(Model model) {
//		model.addAttribute("roledata",userServices.findAll());
		return "adminhomepage";
	}
	
	@RequestMapping("/admintheatre")	
	public String getTheatre() {
		
		return "admintheatre1";
	}
	
	@RequestMapping("/addmovie")
	public String getAddMovie() {
		
		return "adminaddmovies";
	}
	
	@RequestMapping("/adminaddtheatre")
	public String getinsertTheatre() {
		return "adminaddtheatre";
	}
	
	@RequestMapping("/managemovies")
	public String getManageMovies() {
		return "adminmanagemovies";
	}
	@RequestMapping("/showbooking")
	public String getShowBooking() {
		return "adminbookingshow";
	}
	@RequestMapping(value="/userHome")
	public String getUserHome() {
		
		return "usertheatreshow";
	}
	
	@RequestMapping("/userbook")
	public String getBook() {
		return "userbooking";
	}
	
	@RequestMapping("/usermovies")
	public String getUserMovie() {
		return "usermovieshow";
	}
	
	@RequestMapping(value="/signUpPage")
	public String signUp() {
		return "signup";
	}
	
	@RequestMapping(value="/signUp",method = RequestMethod.POST)
	public String signUp(@RequestParam String username,@RequestParam String password,@RequestParam String role) {
			
		Users user=new Users();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		user.setRole(role);
		userServices.signUp(user);
			
		return "signup";
	}
		
		
	
}
