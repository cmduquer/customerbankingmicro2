package com.microservicios2.clase2.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios2.clase2.customer.model.Customer;
import com.microservicios2.clase2.customer.model.Notification;
import com.microservicios2.clase2.customer.repository.CustomerRepository;
import com.microservicios2.clase2.customer.service.AccountService;
import com.microservicios2.clase2.customer.service.NotificationService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AccountService accountService;  
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping(value = "/customer")
	public Customer save (@RequestBody Customer customer){
		Notification notification = new Notification("Customer is created", "cmduquer@gmail.com", "9852XXX122");
		notificationService.sendNotification(notification);
		return customerRepository.save(customer);
	}
	
	@GetMapping(value = "/customer")
	public Iterable<Customer> all (){
		return customerRepository.findAll();
	}
	
	@GetMapping(value = "/customer/{customerId}")
	public Customer findByAccountId (@PathVariable Integer customerId){
		Customer customer = customerRepository.findByCustomerId(customerId);
		customer.setAccount(accountService.findByCutomer(customerId));
		return customer;
	}
	
	@PutMapping(value = "/customer")
	public Customer update (@RequestBody Customer customer){
		return customerRepository.save(customer);
	}
	
	@DeleteMapping(value = "/customer")
	public void delete (@RequestBody Customer customer){
		customerRepository.delete(customer);
	}
	
}
