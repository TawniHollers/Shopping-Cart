package com.tawnihollers;

public class Products {
    String name;
    String descrpition;
    double price;

    public String getName() {
        return name;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public double getPrice() {
        return price;
    }

    public Products(String name, String descrpition, double price) {
        this.name = name;
        this.descrpition = descrpition;
        this.price = price;
    }


}
