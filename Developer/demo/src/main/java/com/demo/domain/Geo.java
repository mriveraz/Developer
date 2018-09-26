package com.demo.domain;

import java.io.Serializable;

import com.demo.domain.Address.AddressBuilder;
import com.demo.model.UserModel;
import com.demo.model.UserModel.UserModelBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data  
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Geo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2654194777611941044L;
	
	private String lat ;
	private String lng;

}
