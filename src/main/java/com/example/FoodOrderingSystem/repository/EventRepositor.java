package com.example.FoodOrderingSystem.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FoodOrderingSystem.model.Events;

public interface EventRepositor 
extends MongoRepository<Events, Long> {
    
}
