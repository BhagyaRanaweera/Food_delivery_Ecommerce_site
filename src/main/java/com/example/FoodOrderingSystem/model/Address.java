package com.example.FoodOrderingSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "addresses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    @Id
    private String id; // MongoDB will automatically generate an ObjectId

    private String fullName;
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private String country;

}
