package com.example.FoodOrderingSystem.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "orderItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    private String id; // MongoDB will generate ObjectId as a String

    @DBRef
    private Food food; // Reference to the Food document

    private int quantity;
    
    private Long totalPrice;
    
    private List<String> ingredients;
}
