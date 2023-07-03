package com.learn.DesignPatterns.Behavioural.Proxy;

import java.util.ArrayList;

public class ProxyFileStorage implements FileStorage{
    private ArrayList<String> cache;
    private  RealFileStorage realFileStorage;

    public ProxyFileStorage() {
        this.cache = new ArrayList<>();
        this.realFileStorage = new RealFileStorage();
    }

    private boolean checkPermissions(){
        // for simplicity we'll always return true
        return true;
    }

    @Override
    public void uploadFile(String file) {
        if (checkPermissions()){
            System.out.println("You have sufficient permissions.");
            realFileStorage.uploadFile(file);
        }
        else{
            System.out.println("Could not upload the file. You don't have necessary permissions.");
        }

    }
    @Override
    public void downloadFile(String file) {
        // before downloading check whether the file is in the cache
        if (cache.contains(file)){
            System.out.println(file + "already exists in the cache. Downloading ...");
        }
        else {
            System.out.println("File was not in the cache. Download could take a while...");
            realFileStorage.downloadFile(file);
            // add that file to the cache
            cache.add(file);

        }
    }
}
