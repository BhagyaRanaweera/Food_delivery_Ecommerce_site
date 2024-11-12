package com.example.FoodOrderingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FoodOrderingSystem.model.CartItem;

public interface CartItemRepository  
    extends MongoRepository<CartItem, Long>{


}
