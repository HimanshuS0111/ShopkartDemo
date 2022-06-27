package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Buyer;
@Repository
public interface BuyerRepo extends JpaRepository<Buyer,Long>{

}
