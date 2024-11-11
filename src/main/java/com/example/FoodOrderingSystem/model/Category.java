package com.example.FoodOrderingSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    
    @Id
    private String id; // MongoDB automatically generates ObjectId as a String

    private String name;
    
    @DBRef
    @JsonIgnore
    private Restaurant restaurant; // Reference to Restaurant document
}
