package com.example.FoodOrderingSystem.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.FoodOrderingSystem.model.IngredientsItem;

public interface IngredientsItemRepository
extends MongoRepository<IngredientsItem, Long> {
    
	List<IngredientsItem> findByRestaurantId(Long id);
	@Query("SELECT e FROM IngredientsItem e "
			+ "WHERE e.restaurant.id = :restaurantId "
			+ "AND lower(e.name) = lower(:name)"
			+ "AND e.category.name = :categoryName")
	public IngredientsItem findByRestaurantIdAndNameIngoreCase(
			@Param("restaurantId") Long restaurantId, 
			@Param("name") String name,
			@Param("categoryName") String categoryName);
    
}
