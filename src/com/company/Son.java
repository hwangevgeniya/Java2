package com.company;

public final class Son extends Father {

    private String name;
    private int age;
    private Position position;
    private Hair hair;

    public Son(String name, int age, Position position, Hair hair) {
        super(name, age, position, hair);
        /*this.name = name2;
        this.age = age2;
        this.position = position2;
        this.hair = hair2;*/
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
    public String getInfo() {
        return super.getInfo();
    }
}
