package com.example.petinder.pets.springStuff;

import com.example.petinder.pets.Cat;
import com.example.petinder.pets.Chicken;
import com.example.petinder.pets.Dog;
import com.example.petinder.pets.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetRepository {


    public List<Pet> getAllPets() {
        return List.of(new Dog("Dog1","Bobbie", "a cute Bobbie dog"),
                new Cat("cat1", "Felix", "a dangerous Felix"),
                new Chicken("chicken1", "Hector", "a tasty Hector"));
    }
}
