package com.example.FoodOrderingSystem.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "restaurants")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {

    @Id
    private String id; // MongoDB will use ObjectId as a String

    @DBRef
    private User owner; // Reference to the User document (restaurant owner)
    
    private String name;
    private String description;
    private String cuisineType;

    @DBRef
    private Address address; // Reference to the Address document

    private ContactInformation contactInformation; // Embedded contact information
    
    private String openingHours;
    
    private int numRating;

    private List<String> images; // List of images as a collection
    
    private LocalDateTime registrationDate;
    
    private boolean open;

    @DBRef
    private List<Food> foods = new ArrayList<>(); // Reference to the list of Food items

    @DBRef
    private List<Order> orders = new ArrayList<>(); // Reference to the list of Orders
}
