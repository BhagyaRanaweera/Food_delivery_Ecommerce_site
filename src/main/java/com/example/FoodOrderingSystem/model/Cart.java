package com.example.FoodOrderingSystem.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "carts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    
    @Id
    private String id;

    @DBRef
    private User customer; // Reference to the User document

    @DBRef(lazy = true)
    private List<CartItem> items = new ArrayList<>(); // List of CartItem references
    
    private Long total;
}
