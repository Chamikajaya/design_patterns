package com.learn.DesignPatterns.Behavioural.Adapter;

public class Main {
    public static void main(String[] args) {
        /*
        In this example third party filters were not compatable with our existing code. Hence we had to use an adapter.
        Here filter is the target interface.
        Adaptee was the thirdpartyfilters interface.
         */

        Photo p1 = new Photo("Chamika.png");
        Photo p2 = new Photo("Udani.png");
        Photo p3 = new Photo("Jane.png");

        Filter vividFilter = new VividFilter();
        vividFilter.addFilter(p1);

        FilterAdapter sharpenFilter = new FilterAdapter(new Sharpen());
        FilterAdapter greyScaleFilter = new FilterAdapter(new GreyScale());

        sharpenFilter.addFilter(p2);
        greyScaleFilter.addFilter(p3);







    }
}
