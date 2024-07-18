package com.example.demo.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.Authenticatorrepository;
import com.example.demo.service.Authnticatorservice;
@Service
public class AuthnticatorserviceImplementation implements Authnticatorservice {
	
	
	
	@Autowired
	private Authenticatorrepository authenticatorRepositor;
	
	
	
	
	
	

	@Override
	public User loginuser(String username, String password) {
		// TODO Auto-generated method stub
		User user=authenticatorRepositor.findByUsername(username);
		if(user != null)
		{
			if(user.getPassword().equals(password))
				return user;
		
		else
		{
			 user.setPassword("wrong password");
		}
		}
		return user;
	}

	@Override
	public User Adduser(int Id, String Firstname, String Lastname, String Ussername, String password) {
		// TODO Auto-generated method stub
		 User user = new User();
		user.setId(Id);
		user.setFirstname(Firstname);
		user.setLastname(Lastname);
		user.setPassword(password);
		user.setUsername(Ussername);
		authenticatorRepositor.save(user);
		return user;
	}

}
