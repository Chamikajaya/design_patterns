package com.learn.DesignPatterns.Behavioural.Strategy;

public class Main {
    public static void main(String[] args) {
        // As we can see our context class (ImageStorage) does need to know about the concrete implementations of the Strategies used, instead it communicates with the Strategy interfaces.
        ImageStorage imageStorage = new ImageStorage(new JPEGCompressor(), new Vivid());
        imageStorage.storeImage("FamilyPhoto");

        ImageStorage imageStorage1 = new ImageStorage(new PNGCompressor(), new HighContrastFilter());
        imageStorage1.storeImage("ProfilePicture");
    }
}
