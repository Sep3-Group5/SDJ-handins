package com.example.slaughterhousepart3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class AnimalPart {
    @Id
    @Column
    private int partId;
    @Column
    private String type;

    public AnimalPart(int partId, String type) {
        this.partId = partId;
        this.type = type;
    }

    public AnimalPart() {

    }

    public int getPartId() {
        return partId;
    }

    public String getType() {
        return type;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public void setType(String type) {
        this.type = type;
    }
}
