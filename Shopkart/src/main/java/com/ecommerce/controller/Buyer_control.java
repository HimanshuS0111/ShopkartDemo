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
import com.ecommerce.entity.Buyer;
import com.ecommerce.repo.BuyerRepo;

@RestController
@RequestMapping("/buyer")
public class Buyer_control {

	
	@Autowired
	BuyerRepo br;
	
	@GetMapping("/")
	public List<Buyer> showdata(){
		return br.findAll();
		
	}
	
	@PostMapping("/")
	public List<Buyer> adddata(@RequestBody Buyer ab){
	br.save(ab);
	return br.findAll();
	}
	
	@PutMapping("/")
	public List<Buyer> updatedata(@RequestBody Buyer ab){
		br.save(ab);
		return br.findAll();
		}
	
	@DeleteMapping("/{id}")
	public List<Buyer> deldata(@PathVariable Long id){
		br.deleteById(id);
		return br.findAll();
		
	}

}
