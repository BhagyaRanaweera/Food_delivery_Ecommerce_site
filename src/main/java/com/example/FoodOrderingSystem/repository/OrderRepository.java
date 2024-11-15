package com.example.FoodOrderingSystem.repository;

import java.util.List;
import com.example.FoodOrderingSystem.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends MongoRepository<Order, Long> {
    
    // Finds orders by customer ID using MongoDB's query syntax
    @Query("{'customer.id': ?0}")
    List<Order> findAllUserOrders(@Param("userId") String userId);
    
    // Finds orders by restaurant ID using MongoDB's query syntax
    @Query("{'restaurant.id': ?0}")
    List<Order> findOrdersByRestaurantId(@Param("restaurantId") String restaurantId);
}
