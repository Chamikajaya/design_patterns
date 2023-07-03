package com.learn.DesignPatterns.Behavioural.Singleton;

class Singleton {
    /*When a variable is declared as volatile, it guarantees that any thread that reads the
     field will see the most recently written value*/
    private static volatile Singleton instance = null;
    private Singleton(){

    }

    public static Singleton getInstance(){
        /*By using double if checking we can reduce the performance overhead created by using synchronization*/
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    /*When the first thread gets its turn and creates an instance, the second thread,
                    which was waiting to enter the block, will now check if an instance has already been created or not.
                    Because the first thread already created an instance, the second thread won't create a new one.*/
                    instance = new Singleton();
                    System.out.println("Singleton has been created.");
                }
            }
        }
        System.out.println("Returning the singleton...");
        return instance;
    }

}

public class Main{
    public static void main(String[] args) {
        Singleton.getInstance();
        System.out.println();
        Singleton.getInstance();
        System.out.println();
        Singleton.getInstance();
    }
}
