package com.example.FoodOrderingSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    
    @Id
    private Long id; // MongoDB automatically generates ObjectId as a String

    private String name;
    private String description;
    private Long price;

    @DBRef
    private Category foodCategory; // Reference to Category document

    private List<String> images = new ArrayList<>();

    private boolean available;

    @DBRef
    private Restaurant restaurant; // Reference to Restaurant document
    
    private boolean isVegetarian;
    private boolean isSeasonal;

    @DBRef
    private List<IngredientsItem> ingredients = new ArrayList<>(); // Reference to IngredientsItem documents

    private Date creationDate;
}
