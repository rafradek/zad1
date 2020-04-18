package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");

        dog.name = "Haiko";
        dog.weight = 47.0;

        System.out.println("Hi, I'm "+ dog.name);
        System.out.println("Hi, my weight is "+ dog.weight);

        dog.feed();

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Lion");

        me.pet.name = "Myszojeleń";
        me.pet.weight =  190.0;
        System.out.println(me.pet.species);

    }
}
