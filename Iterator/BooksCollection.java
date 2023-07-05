package com.learn.DesignPatterns.Behavioural.Iterator;

public class BooksCollection implements Collection{

        private String[] books;

        public BooksCollection(String[] books){
            this.books = books;
        }

        @Override
        public Iterator getIterator() {
            return new BooksIterator(books);
        }
}
