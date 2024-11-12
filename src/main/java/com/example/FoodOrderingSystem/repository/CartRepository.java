package com.example.FoodOrderingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.FoodOrderingSystem.model.Cart;

public interface CartRepository  
	extends MongoRepository<Cart,Long>{
}
