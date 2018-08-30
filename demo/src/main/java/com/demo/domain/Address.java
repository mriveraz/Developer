package com.demo.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address  implements Serializable {
	
	private static final long serialVersionUID = -9197359708394832276L;
	
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private Geo geo;
	

}
