package com.greeting.demo.Model;

public class Greeting {
    private long id;
    private String greeting;

    public Greeting(long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}