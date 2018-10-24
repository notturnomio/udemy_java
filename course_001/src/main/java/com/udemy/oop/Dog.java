package com.udemy.oop;

public class Dog {
    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        ++dogsCount;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {

        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wuf-Wuf");
                break;
            case AVERAGE:
                System.out.println("Uf-Uf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tyaf-Tyaf");
                break;
            default:
                System.out.println("Dog's size is undefined");

        }

    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting people");
        } else {
            this.bark();
        }

    }
}