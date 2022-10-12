package com.example.petinder.pets;

public class Pet {

    private final String id;
    private final String name;
    private final String profileText;


    public Pet(String id, String name, String profileText) {
        this.id = id;
        this.name = name;
        this.profileText = profileText;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfileText() {
        return profileText;
    }
}
