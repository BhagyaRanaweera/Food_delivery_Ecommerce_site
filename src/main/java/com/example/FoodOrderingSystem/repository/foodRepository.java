package com.example.FoodOrderingSystem.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FoodOrderingSystem.model.Food;
public interface foodRepository 
extends MongoRepository<Food, Long>{
    
}
