package com.learn.DesignPatterns.Behavioural.Adapter;

public class GreyScale implements ThirdPartyFilters{
    @Override
    public void addFilter(Photo photo) {
        System.out.println("Applying Advanced Greyscale filter to " + photo.getName());
    }
}
