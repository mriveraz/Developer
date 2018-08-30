package com.demo.domain;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityScan
public class User  implements Serializable {
	
	private static final long serialVersionUID = -9197359708394832276L; 

	private Long id;
	private String username;
	private String name;
	private String email;
	private String phone;
	private String website;
	private Address address;
	private Company company ;
	

}
