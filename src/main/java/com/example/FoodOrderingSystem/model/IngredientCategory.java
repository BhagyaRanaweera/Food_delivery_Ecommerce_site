package com.example.FoodOrderingSystem.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ingredientCategories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientCategory {

    @Id
    private Long id; // MongoDB automatically generates ObjectId as a String

    private String name;

    @JsonIgnore
    @DBRef
    private Restaurant restaurant; // Reference to Restaurant document

    @JsonIgnore
    @DBRef
    private List<IngredientsItem> ingredients = new ArrayList<>(); // Reference to IngredientsItem documents
}
