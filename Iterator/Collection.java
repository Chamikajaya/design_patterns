package com.learn.DesignPatterns.Behavioural.Iterator;

public interface Collection {
    /*
    * This interface declares a method for retrieving an iterator:
    * Any class that implements this Collection interface is promising that it will provide a way to get an Iterator for its elements.
    * This is useful because it allows us to write code that can work with any kind of collection, without needing to know the specific details of how that collection is implemented.
    */
    Iterator getIterator();



}
