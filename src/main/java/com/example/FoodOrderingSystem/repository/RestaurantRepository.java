package com.example.FoodOrderingSystem.repository;

import java.util.List;
import com.example.FoodOrderingSystem.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RestaurantRepository extends MongoRepository<Restaurant, Long> {

    // Finds restaurants by name or cuisine type using a case-insensitive search query
    @Query("{$or: [{'name': {$regex: ?0, $options: 'i'}}, {'cuisineType': {$regex: ?0, $options: 'i'}}]}")
    List<Restaurant> findBySearchQuery(String query);

    // Finds restaurant by owner ID
    Restaurant findByOwnerId(Long userId);
}