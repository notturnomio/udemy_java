package com.udemy.oop;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dog's count is " + Dog.getDogsCount());

        Dog york = new Dog();
        york.setPaws(4);
        york.setTail(1);
        york.setName("Kiara");
        york.setBreed("York");
        york.setSize("Small");
        york.bite();

        Dog labrador = new Dog();
        labrador.setPaws(4);
        labrador.setTail(1);
        labrador.setName("Charlie");
        labrador.setBreed("Labrador");
        labrador.setSize("Average");
        labrador.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Kurt");
        sheppard.setBreed("Sheppard");
        sheppard.setSize("Big");
        sheppard.bite();

       /* System.out.println("Labrador's name is " + labrador.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Labrador has " + labrador.getPaws() + " paws");*/


    }
}
