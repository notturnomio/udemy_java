package com.udemy.oop;

public class Dog {
    private static int dogsCount;
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        ++dogsCount;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") && size.equalsIgnoreCase("Average") && size.equalsIgnoreCase("Small")) {
            System.out.println("Size should be: Big, Average, or Small.");
        } else {
            this.size = size;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws for a dog");
            System.out.println("Correct number of paws is 4");
        }

    }

    public int getPaws() {
        return this.paws;
    }

    public int getTail() {
        return this.tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign " + tail + " tails for a dog");
            System.out.println("Correct number of tail is 1");
        }

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        if (this.size.equalsIgnoreCase("Big")) {
            System.out.println("Wuf-Wuf");
        } else if (this.size.equalsIgnoreCase("Average")) {
            System.out.println("Uf-Uf");
        } else {
            System.out.println("Tyaf-Tyaf");
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