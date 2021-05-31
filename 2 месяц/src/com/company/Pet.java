package com.company;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Random;

public class Pet {

    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;


    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){

        Random ageRandom = new Random();
        return ageRandom.nextInt(9)+1;

    }

    public String getInfo(){
        return "Age: " + age + "\nColor: " + color +
                 "\nShelter: "  + shelter.getName() + ", " + shelter.getAddress();
    }
}
