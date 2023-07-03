package com.learn.DesignPatterns.Behavioural.Decorator;

public class CloudStream implements Stream{
    /*
    This is the core component
     */

    // Stores the data in cloud
    @Override
    public void uploadData(String data){
        System.out.println("Uploading data -> " + data + " <- to the cloud");
    }


}
