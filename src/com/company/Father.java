package com.company;

public class Father extends Grandfather {

    private String name;
    private int age;
    private Position position;
    private Hair hair;

    public Father(String name, int age, Position position, Hair hair) {
        super(name, age, position, hair);
        /*this.name = name;
        this.age = age;
        this.position = position;
        this.hair = hair;*/
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public Hair getHair() {
        return hair;
    }

    @Override
    public final void wearGlasses() {
        super.wearGlasses();
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
