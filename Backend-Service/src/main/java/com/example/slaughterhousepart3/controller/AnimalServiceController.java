package com.example.slaughterhousepart3.controller;

import com.example.slaughterhousepart3.entity.Animal;
import com.example.slaughterhousepart3.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class AnimalServiceController {
    private AnimalService animalService;

    public AnimalServiceController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(value = "/animals/{id}")
    public ResponseEntity<Object> getAnimalById(@PathVariable("id") int id) {
        Optional<Animal> animal = animalService.getAnimalById(id);
        if (!animal.isPresent())
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(animal.get(), HttpStatus.OK);
    }

    @GetMapping(value = "/animals2/{date}")
    public ResponseEntity<List<Animal>> getAnimalByDate(@PathVariable("date") LocalDate date) {
        List<Animal> animals = animalService.getAnimalByDate(date);
        if (animals.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping(value = "/animals3/{origin}")
    public ResponseEntity<List<Animal>> getAnimalByOrigin(@PathVariable("origin") String origin)
    {
        List<Animal> animals = animalService.getAnimalByOrigin(origin);
        if (animals.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @PostMapping(value = "/animals")
    public ResponseEntity<Object> addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
        return new ResponseEntity<>("Animal successfully registered", HttpStatus.CREATED);
    }
}
