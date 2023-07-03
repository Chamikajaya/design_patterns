package com.learn.DesignPatterns.Behavioural.Strategy;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using PNG compressor");
    }
}
