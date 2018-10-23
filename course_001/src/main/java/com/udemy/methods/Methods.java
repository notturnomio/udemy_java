package com.udemy.methods;

public class Methods {

    public static void main(String[] args) {
        printMessage("Alex");
        int a = 5;
        int b = 10;
        System.out.println("Rectangle square = " + calcRectangleSquare(a, b));
        System.out.println("Square square = " + calcSquare(b));
        System.out.println("SUM of squares = " + (calcRectangleSquare(a, b) + calcSquare(b)));

        String str1 = "I like black coffee";
        String str3 = "I like coffee!!!";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "I like coffee";
        String str4 = new String("I like coffee");

        String substring = str3.substring(0, 13);
        System.out.println("Substring = " + substring);
        boolean sub = str2 == str4;
        boolean equal = str2.equals(str4);
        System.out.println(sub);
        System.out.println(equal);

        boolean iLike = str1.startsWith("I like");
        boolean like = str1.startsWith(" like", 1);
        boolean coffee = str1.endsWith("fee");
        System.out.println("boolean iLike is " + iLike);
        System.out.println("boolean like is " + like);
        System.out.println("boolean cofee is " + coffee);

        System.out.println(str1.replace("black", "white"));
        System.out.println(str3.indexOf("!!!"));
        System.out.println(str3.indexOf("if no symbol"));
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}
