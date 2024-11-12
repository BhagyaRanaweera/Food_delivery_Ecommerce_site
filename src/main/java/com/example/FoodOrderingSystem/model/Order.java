package com.example.FoodOrderingSystem.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    @Id
    private Long id; // MongoDB uses ObjectId, stored as String in Java

    @DBRef
    private User customer; // Reference to User document

    @JsonIgnore
    @DBRef
    private Restaurant restaurant; // Reference to Restaurant document

    private Long totalAmount;
    
    private String orderStatus;

    private Date createdAt; // MongoDB will store this as a date type

    @DBRef
    private Address deliveryAddress; // Reference to Address document

    @DBRef
    private List<OrderItem> items; // List of OrderItem documents

    private int totalItem;
    
    private int totalPrice;
}
