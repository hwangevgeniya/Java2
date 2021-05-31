package com.company;

public class Grandfather {

    private String name;
    private int age;
    private Position position;
    private Hair hair;

    public Grandfather(String name, int age, Position position, Hair hair) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.hair = hair;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    public Hair getHair() {
        return hair;
    }

    public void wearGlasses(){

        System.out.println(position + " " + name + " wears glasses.");
    }

    public String getInfo(){

        return "Name - " + name + "\nAge - " + age + "\nPosition - " + position + "\nHair - " + hair.getColor() +
                " / " + hair.getLength();
    }
}
