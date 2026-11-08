package com.food.delivery.restaurant_listing.service;

import com.food.delivery.restaurant_listing.dto.RestaurantDTO;
import com.food.delivery.restaurant_listing.entity.Restaurant;
import com.food.delivery.restaurant_listing.mapper.RestaurantMapper;
import com.food.delivery.restaurant_listing.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants =  restaurantRepo.findAll();
        return restaurants.stream()
                .map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDTO)
                .toList();
    }
}
