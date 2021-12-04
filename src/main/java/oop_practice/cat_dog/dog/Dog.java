package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    private String name;

    static String type = "Dog";
    static String voice = "Woof";

    public Dog(String name){
        super(name, voice, type);
        this.name = name;
    }
}
