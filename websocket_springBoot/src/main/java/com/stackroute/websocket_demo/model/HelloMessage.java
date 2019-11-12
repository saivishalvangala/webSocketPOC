package com.stackroute.websocket_demo.model;

public class HelloMessage {
    private String message;

    public HelloMessage(){

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public HelloMessage(String message) {
        this.message = message;
    }
}
