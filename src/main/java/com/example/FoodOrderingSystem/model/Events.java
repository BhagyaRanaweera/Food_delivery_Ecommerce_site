package com.example.FoodOrderingSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Events {
    
    @Id
    private String id; // MongoDB automatically generates ObjectId as a String
    
    private String image;
    private String startedAt;
    private String endsAt;
    private String name;
    
    @DBRef
    private Restaurant restaurant; // Reference to Restaurant document
    
    private String location;
}
