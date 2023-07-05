package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class Main {
    public static void main(String[] args) {
        MobileApp androidApp= new MobileApp(new AndroidUIFactory());  // For designing android ui s
        androidApp.createUI();
        androidApp.click();
        androidApp.hover();
        androidApp.shareText();
        androidApp.textHighlightener();
        System.out.println();

        MobileApp iosApp= new MobileApp(new IOSUIFactory());  // For designing IOS ui s
        iosApp.createUI();
        iosApp.hover();
        iosApp.shareText();
        iosApp.textHighlightener();
        iosApp.click();





    }






}
