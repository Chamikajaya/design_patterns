package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class MobileApp {
    private UIComponentFactory uiComponentFactory;
    private Button button;
    private TextField textField;

    public MobileApp(UIComponentFactory uiComponentFactory) {
        this.uiComponentFactory = uiComponentFactory;
    }

    public void createUI(){
        button = uiComponentFactory.createButton();
        textField = uiComponentFactory.createTextField();
    }
    public void textHighlightener(){
        textField.highlight();
    }
    public  void shareText(){
        textField.shareText();

    }

    public void hover(){
        button.onHover();
    }

    public void click(){
        button.onClick();
    }



}
