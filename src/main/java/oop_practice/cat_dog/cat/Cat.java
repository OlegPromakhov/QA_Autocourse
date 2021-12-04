package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {
    private String name;

    static String type = "Cat";
    static String voice = "Meow";

    public Cat(String name){
        super(name, voice, type);
        this.name = name;
    }
}
