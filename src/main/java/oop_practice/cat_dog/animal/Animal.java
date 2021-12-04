package oop_practice.cat_dog.animal;

public class Animal {

    private static String name;
    private static String voice;
    private static String type;

    public Animal(String name, String voice, String type) {
        this.name = name;
        this.voice = voice;
        this.type = type;
    }

    public static void sound() {
        System.out.println("I am a " + type + ". My name is " + name + ". " + voice);
    }

}
