package com.example.FoodOrderingSystem.model;

import java.util.ArrayList;
import java.util.List;

import com.example.FoodOrderingSystem.dto.RestaurantDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Long id; // MongoDB uses String or ObjectId as the id type

    private String fullName;
    private String email;
    private String password;

    private USER_ROLE role;

    @JsonIgnore
    @DBRef
    private List<Order> orders = new ArrayList<>(); // Reference to the list of Orders

    private List<RestaurantDto> favorites = new ArrayList<>(); // If you want it embedded, this remains as is, else you can use DBRef if it's a reference

    @DBRef
    private List<Address> addresses = new ArrayList<>(); // Reference to Address documents
}
