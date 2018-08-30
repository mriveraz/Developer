package com.demo.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.domain.User;


@FeignClient(name= "externService", url="https://jsonplaceholder.typicode.com")
public interface DemoIntegration {
	

	

	@GetMapping(value="/users", produces= {"application/json"})
	ResponseEntity<List<User>> users();
	
}
	