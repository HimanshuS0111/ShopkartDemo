package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Seller;
import com.ecommerce.service.AdminService;

@RestController
@RequestMapping("/admin")
public class Admin_control {
@Autowired
AdminService adservice;
	//Admin Login
	@GetMapping("/login")
	public ResponseEntity<String> loginAdmin(@RequestParam String username ,@RequestParam String password ) {
		return adservice.loginAdmin(username,password);
	}
	
	//Validate Seller
	@PutMapping("/approve/seller")
	public ResponseEntity<String> sellerApproval(@RequestParam Long sellerId) {
		return adservice.sellerApproval(sellerId);
	}
	

}
