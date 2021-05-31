package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shelter romashka = new Shelter("Romashka", "Ibraimova 90");

    Dog sharik = new Dog(romashka);
    Dog layka = new Dog("Layka", "Чихуахуа", Color.BLACK, romashka);
    Dog barsik = new Dog("Barsik", "Домашний", Color.BROWN, romashka, new String[]{"Стоять", "Сидеть"});

        System.out.println(barsik.getInfo());
        barsik.makeVoice("Гав-гав", 3);
        barsik.makeVoice(1,"Аф-аф");
        barsik.makeVoice("Аф");

        System.out.println(layka.getInfo());
        layka.makeVoice("Laf-laf",1);
        layka.makeVoice(2,"laf-laf-laf");
        layka.makeVoice("Laf");

        System.out.println(sharik.getInfo());
        sharik.makeVoice("Uaf-uaf",2);
        sharik.makeVoice(1,"Uaffii");
        sharik.makeVoice("Uaf");
    }
}
