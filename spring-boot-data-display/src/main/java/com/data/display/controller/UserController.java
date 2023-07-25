package com.data.display.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.display.modal.Users;
import com.data.display.service.UserService;



@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")  
	public List<Users> getAllUsers()   
	{  
	return userService.getAllUsers();  
	} 
	
	@GetMapping("/user/{id}")  
	public Users getStudent(@PathVariable("id") int id)   
	{  
	return userService.getUserById(id);  
	} 
	
	@GetMapping("/v1/helloworld")
	public String HelloWorld() {
		return "HelloWorld";
	}
	@DeleteMapping("/user/{id}")  
	public void deleteStudent(@PathVariable("id") int id)   
	{  
		userService.delete(id);  
	}
	@PostMapping("/user/save")  
	public int saveStudent(@RequestBody Users user)   
	{  
		userService.saveOrUpdate(user);  
	return user.getId();  
	/*
	 * insert into USERS values (2,28,'rama@gmail.com','rama','krishna');
	 * 
	 * 
	 * select * FROM USERS;
	 */
	}
	
}
