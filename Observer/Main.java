package com.learn.DesignPatterns.Behavioural.Observer;

public class Main {
    public static void main(String[] args) {
        NewspaperSubject newspaper = new NewspaperSubject("First Edition");

        Subscriber sub1 = new Subscriber("Chamika");
        Subscriber sub2 = new Subscriber("John");
        Subscriber sub3 = new Subscriber("Emma");

        newspaper.registerObserver(sub1);
        newspaper.registerObserver(sub2);
        newspaper.registerObserver(sub3);

        newspaper.publishNewEdition("Second Edition");

        System.out.println();

        // Unsubscribing John
        newspaper.unregisterUser(sub2);  // John will no longer get notifications
        newspaper.publishNewEdition("Third Edition");






    }
}
