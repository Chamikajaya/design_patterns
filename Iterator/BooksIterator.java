package com.learn.DesignPatterns.Behavioural.Iterator;

public class BooksIterator implements Iterator{

    private String[] books;
    private int position;

    public BooksIterator(String[] books){
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= books.length || books[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        String book = books[position];
        position++;
        return book;
    }
}
