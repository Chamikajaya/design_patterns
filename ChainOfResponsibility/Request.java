package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

    public class Request {
    private  String username;
    private String password;

    public Request(String username, String password) {
        this.username = username;
        this.password = password;
    }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
