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
    private Long id; // Use String for MongoDB's ObjectId

    @DBRef
    private Food food; // Reference to the Food document

    private int quantity;
    
    private Double totalPrice; // Consider using Double or BigDecimal for currency values
    
    private List<String> ingredients;
}
