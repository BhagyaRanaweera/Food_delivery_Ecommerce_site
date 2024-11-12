package com.example.FoodOrderingSystem.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import lombok.Data;

@Document(collection = "notifications") // Specify the MongoDB collection name
@Data
public class Notification {

    @Id
    private String id; // MongoDB uses String as the ID type by default

    @DBRef // Creates a reference to another document in MongoDB
    private User customer;

    @DBRef
    private Restaurant restaurant;

    private String message;

    private Date sentAt;

    private boolean readStatus;
}