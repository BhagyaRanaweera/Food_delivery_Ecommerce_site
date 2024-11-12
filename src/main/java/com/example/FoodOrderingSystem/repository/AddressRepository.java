package com.example.FoodOrderingSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.FoodOrderingSystem.model.Address;


public interface AddressRepository
    extends MongoRepository<Address,Long> {
}