package com.example.FoodOrderingSystem.repository;

import com.example.FoodOrderingSystem.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReviewRepository extends MongoRepository<Review, Long> {
    
   
}
