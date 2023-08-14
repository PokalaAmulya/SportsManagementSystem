package com.sms.dto;


import javax.validation.constraints.NotBlank


;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class SportsDTO {
	

	@NotBlank(message="user Id  should not be blank")
	@NotNull(message="user Name should not be null")
	private int id;
	

	@NotBlank(message="user Name should not be blank")
	@NotNull(message="user Name should not be null")
	private String name;
	
	@NotBlank(message="User Name should not be blank")
	private String location;

}



