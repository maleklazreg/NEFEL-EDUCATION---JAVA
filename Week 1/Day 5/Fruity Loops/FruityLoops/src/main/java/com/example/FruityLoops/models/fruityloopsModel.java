package com.example.FruityLoops.models;

public class fruityloopsModel {
	// MEMBER VARIABLES
    private String name;
    private double price;

    // CONSTRUCTOR
    public fruityloopsModel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
