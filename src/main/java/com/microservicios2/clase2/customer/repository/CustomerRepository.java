package com.microservicios2.clase2.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios2.clase2.customer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	Customer findByCustomerId(Integer customerId);
	
}
