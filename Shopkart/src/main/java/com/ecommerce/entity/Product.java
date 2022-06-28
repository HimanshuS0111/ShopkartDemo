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
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private String category;
	private String brand;
	private int quantity;
	private String isApproved;
	private String description;
	private String productPrice;
	private Long sellerId;
	private String active;

	@Column(name="category_id")
	private Long categoryId;
	
	public Product() {
		
	}

	public Product(Long productId, String productName, String category, String brand, int quantity, String isApproved,
			String description, String productPrice, Long sellerId, String active, Long categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.brand = brand;
		this.quantity = quantity;
		this.isApproved = isApproved;
		this.description = description;
		this.productPrice = productPrice;
		this.sellerId = sellerId;
		this.active = active;
		this.categoryId = categoryId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", brand=" + brand + ", quantity=" + quantity + ", isApproved=" + isApproved + ", description="
				+ description + ", productPrice=" + productPrice + ", sellerId=" + sellerId + ", active=" + active
				+ ", categoryId=" + categoryId + "]";
	}
	
}
