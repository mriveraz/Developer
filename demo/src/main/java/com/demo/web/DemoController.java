package com.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.UserModel;
import com.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/listado", method= RequestMethod.GET)
	public List<UserModel> listado() {
		
		return demoService.listaModel();
	}
	
	@RequestMapping(value="/ganador", method= RequestMethod.GET)
	public UserModel ganador() {
		
		return demoService.ganadorModel();
		
	}
	
	@RequestMapping(value="/ganador/{id}", method= RequestMethod.GET) 
   public UserModel ganadorById(@PathVariable("id") long id) {
	   
	return demoService.ganadorById(id);
	
	}
	
	@RequestMapping(value="/pairWinner", method= RequestMethod.GET) 
	public  List<UserModel> pairWinner() {
		
		
		return demoService.pairWinner();
		
	}
	
	@RequestMapping(value="/findItem/", method= RequestMethod.GET)
    public  List<UserModel> findItem(@RequestParam(value="item") int item ){
		
		
		return demoService.findItem(item);
		
	}
	
	
	@RequestMapping(value="/data/{id}", method= RequestMethod.GET)
	public Object data(@PathVariable("id") long id , @RequestParam(value="field") String field)
	 {
		
		return demoService.data(id, field);
			
	}
	
}
