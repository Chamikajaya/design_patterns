package com.learn.DesignPatterns.Behavioural.Strategy;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using JPEG compressor");
    }
}
