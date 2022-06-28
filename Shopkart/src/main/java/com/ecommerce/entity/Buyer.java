package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="register_buyer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long buyerId;
	
	private String buyerName;
	private String username;
	private String password;
	private String mobileNo;
	private Double wallet;
	
	@Column(name = "place_order_id")
	private long placeOrderId;
}
