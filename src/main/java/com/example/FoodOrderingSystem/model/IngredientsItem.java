package com.example.FoodOrderingSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ingredientsItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsItem {

    @Id
    private Long id; // MongoDB automatically generates ObjectId as a String
    
    private String name;

    @JsonIgnore
    @DBRef
    private Restaurant restaurant; // Reference to Restaurant document

    private boolean inStock = true;

    @DBRef
    private IngredientCategory category; // Reference to IngredientCategory document
}
