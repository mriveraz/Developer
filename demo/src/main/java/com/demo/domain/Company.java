package com.demo.domain;

import java.io.Serializable;

import com.demo.domain.Address.AddressBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7335615270769581200L;
	
	private String name;
	private String catchPhrase;
	private String bs;

}
