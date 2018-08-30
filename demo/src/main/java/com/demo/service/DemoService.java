package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.UserModel;


public interface DemoService {
	
	
	
	List<UserModel> listaModel();
	UserModel ganadorModel();
	UserModel ganadorById(Long id);
	List<UserModel> pairWinner();
	List<UserModel> findItem(int item);
	Object data(long id, String field);
	
	
}
 
