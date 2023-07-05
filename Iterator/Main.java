package com.learn.DesignPatterns.Behavioural.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] books = {"Book1", "Book2", "Book3", "Book4", "Book5"};
        Collection booksCollection = new BooksCollection(books);
        Iterator booksIterator = booksCollection.getIterator();
        while(booksIterator.hasNext()){
            System.out.println(booksIterator.next());
        }
    }
}
