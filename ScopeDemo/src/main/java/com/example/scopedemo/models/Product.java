package com.example.scopedemo.models;

public class Product {

    private String description;
    private int quantity;

    public Product(String description, int quantity) {
        this.description = description;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
