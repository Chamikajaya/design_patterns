package com.learn.DesignPatterns.Behavioural.Composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating individual products
        Component phone = new Product("Pixel 7", 1000);
        Component console = new Product("Play Station", 1200);
        Component laptop = new Product("AlienWare", 3000);
        Component tv = new Product("Samsung TV", 2000);

        // Creating a nested gift box
        GiftBox nestedBox = new GiftBox("Electronics Box");
        nestedBox.addToBox(laptop);
        nestedBox.addToBox(tv);

        // Creating the main gift box
        GiftBox mainBox = new GiftBox("Main Box");
        mainBox.addToBox(phone);
        mainBox.addToBox(console);
        mainBox.addToBox(nestedBox);

        // Displaying the contents of the main gift box
        System.out.println("Contents of the Main Box:");
        mainBox.displayProduct();
        /*
        When the displayProduct() method is called on the nested gift box,
        it iterates over its components (laptop and tv) and calls their displayProduct() methods as well.
         */
        System.out.println();

        // Calculating the total price of the main gift box
        int totalPrice = mainBox.getTotalPrice();
        System.out.println("Total price of the Main Box: $" + totalPrice);
    }



}

