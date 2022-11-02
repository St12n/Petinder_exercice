package com.example.petinder.controllers;

import com.example.petinder.pets.springStuff.PetDTO;

import com.example.petinder.pets.springStuff.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pets")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping(path = "hello")
    public String hello(){
        return "Hello Pets";
    }
    @GetMapping(produces = "application/json")
    @PreAuthorize("hasAuthority('VIEW_PETS')")
    public List<PetDTO> getAllPets() {
        return petService.getAllPets();
    }

}
