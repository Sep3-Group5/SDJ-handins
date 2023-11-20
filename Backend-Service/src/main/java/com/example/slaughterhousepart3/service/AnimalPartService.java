package com.example.slaughterhousepart3.service;

import com.example.slaughterhousepart3.repository.AnimalPartRepository;
import com.example.slaughterhousepart3.repository.AnimalRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalPartService {

    private AnimalPartRepository animalPartRepository;

    public AnimalPartService(AnimalPartRepository animalPartRepository) {
        this.animalPartRepository = animalPartRepository;
    }


    // methods
}
