

package com.example.FoodOrderingSystem.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    
    @Id
    private Long id; // MongoDB will generate an ObjectId, stored as a String

    @DBRef
    private User customer; // Reference to the User document

    @DBRef
    @JsonIgnore
    private Restaurant restaurant; // Reference to the Restaurant document
    
    private String message;
    
    private double rating;

    private LocalDateTime createdAt;
}
