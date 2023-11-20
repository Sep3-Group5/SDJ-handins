package com.example.slaughterhousepart3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class Animal {
    @Id
    @Column
    private int id;
    @Column
    private LocalDate date;
    @Column
    private double weight;
    @Column
    private Long regNum;
    @Column
    private String origin;
    @Column
    private String type;

    public Animal() {

    }

    public Animal(int id, LocalDate date, double weight, Long regNum, String origin, String type) {
        this.id = id;
        this.date = date;
        this.weight = weight;
        this.regNum = regNum;
        this.origin = origin;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Long getRegNum() {
        return regNum;
    }

    public void setRegNum(Long regNum) {
        this.regNum = regNum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "date=" + date +
                ", weight=" + weight +
                ", regNum=" + regNum +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
