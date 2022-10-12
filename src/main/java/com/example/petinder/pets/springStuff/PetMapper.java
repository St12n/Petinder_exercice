package com.example.petinder.pets.springStuff;

import com.example.petinder.pets.Pet;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PetMapper {
    public List<PetDTO> toDTO(List<Pet> petList) {
        return petList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public PetDTO toDTO(Pet pet){
        return new PetDTO(pet.getId(), pet.getName(), pet.getProfileText());
    }
}
