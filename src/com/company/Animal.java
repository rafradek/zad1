package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    private Double weight = 1.0;
    File pic;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog")
            weight = 20.0;
        else if (species == "Lion")
            weight = 190.0;
        else
            weight = 1.0;
    }

    void feed(){
        weight += 0.1;
        System.out.println("Thx, my weight is now "+ getWeight());
    }

    public Double getWeight() {
        return weight;
    }
}
