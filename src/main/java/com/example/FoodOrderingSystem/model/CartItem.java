package com.example.FoodOrderingSystem.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cartItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    
    @Id
    private Long id;

    @DBRef
    private Cart cart; // Reference to Cart document

    @DBRef
    private Food food; // Reference to Food document

    private int quantity;

    private List<String> ingredients;

    private Long totalPrice;
}
