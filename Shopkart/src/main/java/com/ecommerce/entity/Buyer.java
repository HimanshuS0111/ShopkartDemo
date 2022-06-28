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
	
	public Buyer() {
		
	}

	public Buyer(Long buyerId, String buyerName, String username, String password, String mobileNo, Double wallet,
			long placeOrderId) {
		super();
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.wallet = wallet;
		this.placeOrderId = placeOrderId;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

	public long getPlaceOrderId() {
		return placeOrderId;
	}

	public void setPlaceOrderId(long placeOrderId) {
		this.placeOrderId = placeOrderId;
	}

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", buyerName=" + buyerName + ", username=" + username + ", password="
				+ password + ", mobileNo=" + mobileNo + ", wallet=" + wallet + ", placeOrderId=" + placeOrderId + "]";
	}
	
}
