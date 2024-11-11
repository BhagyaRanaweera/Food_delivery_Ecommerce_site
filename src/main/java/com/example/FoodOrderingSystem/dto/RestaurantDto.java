package com.example.FoodOrderingSystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class RestaurantDto {

    private String title;

    private List<String> images; // List of images for the restaurant

    private String description;

    private Long id; // ID of the restaurant

}
