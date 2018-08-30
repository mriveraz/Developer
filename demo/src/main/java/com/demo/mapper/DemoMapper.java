package com.demo.mapper;

import java.util.ArrayList;

import org.springframework.lang.UsesSunHttpServer;

import com.demo.domain.User;
import com.demo.model.UserModel;

public class DemoMapper {
	
	public  static UserModel  UserToUserModel(User user) {
		
		
		
		UserModel userModel = new UserModel();
	
		userModel.setFullName(user.getName() + user.getUsername());
		userModel.setAddress(user.getAddress().getStreet() + user.getAddress().getSuite() + user.getAddress().getCity()+user.getAddress().getZipcode());
		userModel.setCompany(user.getName());
	    userModel.setId(user.getId());
		return userModel;
		
		
		
	}

}
