package com.learn.DesignPatterns.Behavioural.Strategy;

public class ImageStorage {
    // This is the context class
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;

    }

    public void storeImage(String fileName){
        compressor.compress(fileName);
        filter.applyFilter(fileName);
    }



}
