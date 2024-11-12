package com.example.FoodOrderingSystem.repository;
import java.util.List;

import javax.management.Notification;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FoodOrderingSystem.model.IngredientsItem;
public interface NotificationRepository
extends MongoRepository<IngredientsItem, Long> {
    public List<Notification> findByCustomerId(Long userId);
	public List<Notification> findByRestaurantId(Long restaurantId);
}
