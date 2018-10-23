package com.udemy.controlstatement;

public class Controls {

    public static void main(String[] args) {

        int i = 10;

        {
            int k = 15;
            System.out.println("K = " + k);
        }

        System.out.println("I = " + i);

        int testScore = 65;
        System.out.println("You've got");
        if (testScore >= 90) {
            System.out.println("an excellent");
        } else if (testScore >= 75) {
            System.out.println("a good");
        } else if (testScore >= 60) {
            System.out.println("a satisfactory");
        } else {
            System.out.println("a bad");
        }
        System.out.println("mark");

    }
}
