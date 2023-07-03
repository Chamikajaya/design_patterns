package com.learn.DesignPatterns.Behavioural.Decorator.CoffeeShop;

public class Main {
    public static void main(String[] args) {
        /*
        We implemented a common interface "Coffee"
        Concrete components were Espresso & Cappuccino
        Decorators were whipped cream & caramel syrup decorator classes
         */

        // Regular Espresso
        Coffee myEspresso = new Espresso();
        System.out.println(myEspresso.getDescription());
        System.out.println("Cost  = " + myEspresso.getCost());
        System.out.println();

        // Cappuccino with whipped cream
        Coffee capWithCream = new WhippedCreamDecorator(new Cappuccino());
        System.out.println(capWithCream.getDescription());
        System.out.println("Cost  = " + capWithCream.getCost());
        System.out.println();

        // Espresso with cream and caramel
        Coffee espressoCreamCaramel = new WhippedCreamDecorator(new CaramelSyrupDecorator(new Espresso()));
        System.out.println(espressoCreamCaramel.getDescription());
        System.out.println("Cost +  = " + espressoCreamCaramel.getCost());

    }

}
