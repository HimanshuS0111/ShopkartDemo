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

import com.ecommerce.entity.Admin;
import com.ecommerce.repo.AdminRepo;

@RestController
@RequestMapping("/admin")
public class Admin_control {

	
	@Autowired
	AdminRepo ar;
	
	@GetMapping("/")
	public List<Admin> showdata(){
		return ar.findAll();
		
	}
	
	@PostMapping("/")
	public List<Admin> adddata(@RequestBody Admin ab){
	ar.save(ab);
	return ar.findAll();
	}
	
	@PutMapping("/")
	public List<Admin> updatedata(@RequestBody Admin ab){
		ar.save(ab);
		return ar.findAll();
		}
	
	@DeleteMapping("/{id}")
	public List<Admin> deldata(@PathVariable Long id){
		ar.deleteById(id);
		return ar.findAll();
		
	}

}
