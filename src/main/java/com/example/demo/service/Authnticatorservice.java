package com.example.demo.service;

import com.example.demo.entity.User;

public interface Authnticatorservice {
	
	
	User Adduser(int Id,String Firstname,String Lastname,String Ussername ,String password);
	User loginuser(String username,String password);

}
