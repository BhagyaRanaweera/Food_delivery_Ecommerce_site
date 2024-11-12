package com.example.FoodOrderingSystem.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.FoodOrderingSystem.model.User;

public interface UserRepository extends MongoRepository<User, Long> {

    // Finds users with a 'PENDING' status
    @Query("{'status': 'PENDING'}")
    List<User> getPendingRestaurantOwners();

    // Finds user by email
    User findByEmail(String email);

}
