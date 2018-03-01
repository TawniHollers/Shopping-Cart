package com.tawnihollers;


public class Vendors {
    String name;
    Products[] product;

    // Constructor
    public Vendors(String name, Products[] product){
        this.name = name;
        this.product = product;
    }

    //    Getter
    public String getName() {
        return name;
    }

//    public Products[] getProducts(){
//        return product;
//    }
//
//    public void printProducts(){
//        for(Products product : this.getProducts()){
//            System.out.println(product);
//
//        }


}
