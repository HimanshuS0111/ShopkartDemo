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
import com.ecommerce.entity.Seller;
import com.ecommerce.repo.SellerRepo;

@RestController
@RequestMapping("/seller")
public class Seller_control {

	
	@Autowired
	SellerRepo sr;
	
	@GetMapping("/")
	public List<Seller> showdata(){
		return sr.findAll();
		
	}
	
	@PostMapping("/")
	public List<Seller> adddata(@RequestBody Seller ab){
	sr.save(ab);
	return sr.findAll();
	}
	
	@PutMapping("/")
	public List<Seller> updatedata(@RequestBody Seller ab){
		sr.save(ab);
		return sr.findAll();
		}
	
	@DeleteMapping("/{id}")
	public List<Seller> deldata(@PathVariable Long id){
		sr.deleteById(id);
		return sr.findAll();
		
	}


}
