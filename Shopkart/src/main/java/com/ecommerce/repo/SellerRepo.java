package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Seller;
@Repository
public interface SellerRepo extends JpaRepository<Seller,Long>{

}
