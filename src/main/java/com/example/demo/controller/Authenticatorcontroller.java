package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.Authnticatorservice;

@RestController
public class Authenticatorcontroller {
	
	@Autowired
	Authnticatorservice authnticatorService;
	
	@GetMapping("/login")
	public User loginuser(@RequestParam String  username,@RequestParam String password)
	{
		return authnticatorService.loginuser(username, password);
	}
	@PostMapping("/add")
	public User adduser(@RequestParam int id,@RequestParam String firstname,@RequestParam String lastname,@RequestParam String  username,@RequestParam String password)
	{
		return authnticatorService.Adduser(id, firstname, lastname, username, password);
	}
}
