package com.company;

import javafx.geometry.Pos;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hair hair1 = new Hair("Black and grey", "Middle");
        Hair hair2 = new Hair("Black", "Short");
        Hair hair3 = new Hair("Black", "No hair");

        Father father = new Father("Michael",45, Position.FATHER, hair1);

        Son son1 = new Son("Sam", 18, Position.SON, hair2);
        Son son2 = new Son("Dan", 2, Position.SON, hair3);

        System.out.println(father.getInfo());
        father.wearGlasses();
        System.out.println(son1.getInfo());
        son1.wearGlasses();
        System.out.println(son2.getInfo());

    }
}
