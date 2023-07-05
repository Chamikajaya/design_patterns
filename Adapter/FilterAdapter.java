package com.learn.DesignPatterns.Behavioural.Adapter;

public class FilterAdapter implements  Filter{
    private ThirdPartyFilters thirdPartyFilters;

    public FilterAdapter(ThirdPartyFilters thirdPartyFilters) {
        this.thirdPartyFilters = thirdPartyFilters;
    }

    @Override
    public void addFilter(Photo photo) {
        thirdPartyFilters.addFilter(photo);
    }
}
