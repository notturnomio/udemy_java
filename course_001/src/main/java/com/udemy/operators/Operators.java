package com.udemy.operators;

public class Operators {

    public static void main(String[] args) {

//      + - * / % ++ += -= *= /=

        int a = 10;
        int b = 3;

        int c = a + b;
        int d = a - b;

        int e = a * b;
        int f = a / b;

        int g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

//      a = a + 5;
        a += 5;
        System.out.println("new a = " + a);

//      a = a + 1;
        ++a;
        System.out.println("new a = " + a);

//      b = b -1;
        --b;
        System.out.println("new b = " + b);

        int n = 7;
        int m = 7;

        int result1 = 2 * n++;
        int result2 = 2 * ++m;

        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);

//      == != < > <= >= && || ?:

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = x == y;
        System.out.println("boolVal = " + boolVal);

        boolean boolVal2 = x != z;
        System.out.println("boolVal2 = " + boolVal2);

        boolean boolVal3 = x < y;
        boolean resultBool = boolVal2 && boolVal3;
        System.out.println("resultBool = " + resultBool);

        boolean resultBool2 = boolVal || boolVal3;
        System.out.println("resultBool2 = " + resultBool2);

//        true && true = true;
//        true && false = false;
//        true || false = true;
//        false || false = false;

        int s = (x < y) && (y < z) ? x : y;
        System.out.println("ternary result = " + s);

//        x < y ? true : false;


    }
}
