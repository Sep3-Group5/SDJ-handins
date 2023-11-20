package com.example.slaughterhousepart3.service;

import com.example.slaughterhousepart3.entity.Animal;
import org.springframework.stereotype.Service;
import com.example.slaughterhousepart3.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalService {
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Optional<Animal> getAnimalById(int id) {
        return animalRepository.findById(id);
    }

    public List<Animal> getAnimalByDate(LocalDate date)
    {
        List<Animal> animals = animalRepository.findAll()
                .stream()
                .filter(animal -> animal.getDate().isEqual(date))
                .collect(Collectors.toList());
        return animals;
    }

    public List<Animal> getAnimalByOrigin(String origin)
    {
        List<Animal> animals = animalRepository.findAll()
                .stream()
                .filter(animal -> animal.getOrigin().equalsIgnoreCase(origin))
                .collect(Collectors.toList());
        return animals;
    }

    public void addAnimal(Animal animal) {
        animalRepository.save(animal);
    }
}
