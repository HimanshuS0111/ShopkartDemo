package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.entity.PlaceOrder;

import com.ecommerce.repo.PlaceOrderRepo;

@RestController
@RequestMapping("/placeorder")
public class Placeorder_control {

	
	@Autowired
	PlaceOrderRepo pr;
	
	@GetMapping("/")
	public List<PlaceOrder> showdata(){
		return pr.findAll();
		
	}
	
	@PostMapping("/")
	public List<PlaceOrder> adddata(@RequestBody PlaceOrder ab){
	pr.save(ab);
	return pr.findAll();
	}
	
	@PutMapping("/")
	public List<PlaceOrder> updatedata(@RequestBody PlaceOrder ab){
		pr.save(ab);
		return pr.findAll();
		}
	
	@DeleteMapping("/{id}")
	public List<PlaceOrder> deldata(@PathVariable Long id){
		pr.deleteById(id);
		return pr.findAll();
		
	}

}
