package com.learn.DesignPatterns.Behavioural.Builder;

// The "Product" class
class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    // Setters for the product attributes
    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}

// The "Builder" abstract class
abstract class PizzaBuilder{
    // Protected member to hold the product being built
    protected Pizza pizza;

    // Method to return the final product
    public Pizza getPizza(){
        return pizza;
    }

    // Abstract methods defining the steps to build the product
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}

// A "ConcreteBuilder" class
class ItalianPizzaBuilder extends PizzaBuilder{
    // Constructor creates a new product
    public ItalianPizzaBuilder() {
        pizza = new Pizza();
    }

    // Implement the abstract build methods
    @Override
    public void buildDough() {
        pizza.setDough("Italian Dough"); // Set the product attribute
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Italian Sauce"); // Set the product attribute
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Italian Topping"); // Set the product attribute
    }
}

// Another "ConcreteBuilder" class
class GermanPizzaBuilder extends PizzaBuilder{
    // Constructor creates a new product
    public GermanPizzaBuilder() {
        pizza = new Pizza();
    }

    // Implement the abstract build methods
    @Override
    public void buildDough() {
        pizza.setDough("German Dough"); // Set the product attribute
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("German Sauce"); // Set the product attribute
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("German Topping"); // Set the product attribute
    }
}

// The "Director" class
class Director{
    // Holds a builder instance
    private PizzaBuilder pizzaBuilder;

    // Constructor sets the builder instance
    public Director(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    // Method to construct the product using the builder instance
    public Pizza getPizza(){
        pizzaBuilder.buildDough(); // Call the build method
        pizzaBuilder.buildSauce(); // Call the build method
        pizzaBuilder.buildTopping(); // Call the build method
        return pizzaBuilder.getPizza(); // Return the final product
    }
}

// The "Client" class
public class Main{
    public static void main(String[] args) {
        // Create a director with a specific builder
        Director director = new Director(new ItalianPizzaBuilder());
        // Construct a product
        Pizza pizza = director.getPizza();

        // Change the builder
        director = new Director(new GermanPizzaBuilder());
        // Construct another product
        pizza = director.getPizza();
    }
}
