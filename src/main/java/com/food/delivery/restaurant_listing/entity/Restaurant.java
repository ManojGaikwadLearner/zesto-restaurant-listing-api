package com.food.delivery.restaurant_listing.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
