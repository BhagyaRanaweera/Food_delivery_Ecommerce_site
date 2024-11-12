package com.example.FoodOrderingSystem.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.FoodOrderingSystem.model.Category;
public interface CategoryRepository 
extends  MongoRepository<Category, Long>{

    
}
