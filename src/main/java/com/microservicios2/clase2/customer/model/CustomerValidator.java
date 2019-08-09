package com.microservicios2.clase2.customer.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	}

}
