package com.example.petinder.pets.springStuff;

public class PetDTO {
    private  String id;
    private  String name;
    private  String profileText;

    public PetDTO(String id, String name, String profileText) {
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
