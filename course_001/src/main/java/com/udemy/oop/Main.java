package com.udemy.oop;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dog's count is " + Dog.getDogsCount());

        Dog york = new Dog();
        york.setName("Kiara");
        york.setBreed("York");
        york.setSize(Size.SMALL);
        york.bite();

        Dog labrador = new Dog();
        labrador.setName("Charlie");
        labrador.setBreed("Labrador");
        labrador.setSize(Size.AVERAGE);
        labrador.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Kurt");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Size s = Size.BIG;
        System.out.println(s);
        Size s1 = Size.valueOf("AVERAGE");
        System.out.println(s1);

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

       /* System.out.println("Labrador's name is " + labrador.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Labrador has " + labrador.getPaws() + " paws");*/

    }

}
