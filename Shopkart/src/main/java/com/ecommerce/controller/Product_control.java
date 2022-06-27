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
import com.ecommerce.entity.Product;
import com.ecommerce.repo.ProductRepo;

@RestController
@RequestMapping("/product")
public class Product_control {

	
	@Autowired
	ProductRepo pdr;
	
	@GetMapping("/")
	public List<Product> showdata(){
		return pdr.findAll();
		
	}
	
	@PostMapping("/")
	public List<Product> adddata(@RequestBody Product ab){
	pdr.save(ab);
	return pdr.findAll();
	}
	
	@PutMapping("/")
	public List<Product> updatedata(@RequestBody Product ab){
		pdr.save(ab);
		return pdr.findAll();
		}
	
	@DeleteMapping("/{id}")
	public List<Product> deldata(@PathVariable Long id){
		pdr.deleteById(id);
		return pdr.findAll();
		
	}


}
