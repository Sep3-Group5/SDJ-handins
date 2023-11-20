package com.example.slaughterhousepart3.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Animal
{
  @Id
  @Column
  private int animalId;
  @Column
  private String dateOfArrival;
  @Column
  private String name;
  @Column
  private String placeOfOrigin;
  @Column
  private double weight;

  @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
  private List<AnimalPart> AnimalParts;

  public Animal(int animalId, String name, String dateOfArrival, String placeOfOrigin, double weight) {
    this.animalId = animalId;
    this.name = name;
    this.dateOfArrival = dateOfArrival;
    this.placeOfOrigin = placeOfOrigin;
    this.weight = weight;
  }

  public Animal()
  {

  }

  public void setAnimalParts(List<AnimalPart> animalParts) {
    AnimalParts = animalParts;
  }

  public List<AnimalPart> getAnimalParts() {
    return AnimalParts;
  }

  public void addAnimalPart(AnimalPart animalPart)
  {
    AnimalParts.add(animalPart);
  }

  public int getAnimalId()
  {
    return animalId;
  }

  public void setAnimalId(int registrationNo)
  {
    this.animalId = registrationNo;
  }

  public String getDateOfArrival()
  {
    return dateOfArrival;
  }

  public void setDateOfArrival(String dateOfArrival)
  {
    this.dateOfArrival = dateOfArrival;
  }

  public String getPlaceOfOrigin()
  {
    return placeOfOrigin;
  }

  public void setPlaceOfOrigin(String placeOfOrigin)
  {
    this.placeOfOrigin = placeOfOrigin;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
