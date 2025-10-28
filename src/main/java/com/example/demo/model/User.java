package com.example.demo.model;

public class User {

    private String id;
    private String name;
    private String shortName;

    // public User() {
    // }

    public User(String id, String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "', shortName='" + shortName + "'}";
    }
}
