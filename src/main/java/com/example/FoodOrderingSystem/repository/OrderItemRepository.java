package com.example.FoodOrderingSystem.repository;

import com.example.FoodOrderingSystem.model.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;
public  interface OrderItemRepository 
extends MongoRepository<OrderItem, Long> {
    
}
