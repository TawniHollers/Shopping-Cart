package com.tawnihollers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Products[] Array = new Products[5];
        Array[0]= new Products("Apple", "crispy", 3.5);
        Array[1] = new Products("Banana", "red", 3.4);
        Array[2] = new Products("Orange", "green", 3.0);
        Array[3] = new Products("Grapes", "yellow", 2.0);
        Array[4] = new Products("Kiwi", "soggy", 0.5);
        Vendors fruitGuy = new Vendors("Fruit guy", Array);
        System.out.println(fruitGuy.getName() + " sells:");

        for(Products products : Array){
            System.out.println(products.name + ": $" + products.price);
        }

        Products[] veg = new Products[5];
        veg[0] = new Products("Carrots", "orange", 3.0);
        veg[1] = new Products("Baby corn", "little corn", 5.0);
        veg[2] = new Products("Cabbage", "green", 1.0);
        veg[3] = new Products("Onion", "orange", 0.25);
        veg[4] = new Products("Bell Peppers", "orange", 1.2);
        Vendors veggieGirl = new Vendors("Veggie Girl", veg);
        System.out.println("");
        System.out.println(veggieGirl.getName() + " sells:");

        for(Products products : veg){
            System.out.println(products.name + ": $" + products.price);
        }

        Products[] candy = new Products[5];
        candy[0] = new Products("Recess", "peanut butter", 3.0);
        candy[1] = new Products("Oreos", "Does this need a description??", 5.0);
        candy[2] = new Products("Heath", "I dont really know what this tastes like", 1.0);
        candy[3] = new Products("Jelly Beans", "Fun in rainbow colors", 0.25);
        candy[4] = new Products("Twizzlers", "Yummy", 1.2);
        Vendors candyDude = new Vendors("Candy Dude", veg);
        System.out.println("");
        System.out.println(candyDude.getName() + " sells:");

        for(Products products : candy){
            System.out.println(products.name + ": $" + products.price);
        }
    }
}
