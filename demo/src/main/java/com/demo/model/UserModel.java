package com.demo.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.demo.domain.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class UserModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9107920105559830477L;
	
	private String fullName;
	private String address;
	private String company;
	private Long id;
	

	
	
	
	
	
}
