package com.microservicios2.clase2.customer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservicios2.clase2.customer.model.Account;

@FeignClient(name="account-service")
public interface AccountService {
	
	@GetMapping(value = "/account/customer/{customer}")
	List<Account> findByCutomer (@PathVariable("customer") Integer customer);
	
}
