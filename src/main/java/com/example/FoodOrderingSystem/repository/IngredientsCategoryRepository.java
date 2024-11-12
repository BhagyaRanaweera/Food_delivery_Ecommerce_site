package com.example.FoodOrderingSystem.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.FoodOrderingSystem.model.IngredientCategory;
public interface IngredientsCategoryRepository 
extends MongoRepository<IngredientCategory, Long>{
	
	
//	List<IngredientCategory> findByFoodId(Long menuItemId);
	List<IngredientCategory> findByRestaurantId(Long id);

	@Query("SELECT e FROM IngredientCategory e "
			+ "WHERE e.restaurant.id = :restaurantId "
			+ "AND lower(e.name) = lower(:name)")
	IngredientCategory findByRestaurantIdAndNameIgnoreCase(
			@Param("restaurantId") Long restaurantId, @Param("name") String name);
}
