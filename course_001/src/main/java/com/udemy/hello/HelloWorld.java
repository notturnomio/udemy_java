package com.udemy.hello;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte b = 10;
        short c = 200;
        int a = b + 23;

        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("int a = " + a);

        long myLongValue = 1234567898765432112L;
        float myFloatValue = 23.56F;
        double myDoubleValue = 56.45D;

        double sum = a + b + c + myLongValue + myFloatValue + myDoubleValue;
        System.out.println("SUM = " + sum);

        float floatResult = myFloatValue / 3;
        System.out.println("floatResult = " + floatResult);

        double myNewDouble = 23.56;
        System.out.println("myDoubleResult = " + myNewDouble / 3);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00a9';
        System.out.println("Characters");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);

        System.out.println("SUM of Characters:");
        System.out.println(char1 + char2 + char3 + char4 + char5);
        System.out.println("chars: " + char1 + char2 + char3 + char4 + char5);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some text" + " and some other string";
        System.out.println(s);


        short someShort = b;
        int someInt = someShort;

        someShort = (short) someInt;

        System.out.println("myLongValue = " + myLongValue);
        someInt = (int) myLongValue;
        System.out.println("someInt = " + someInt);

        System.out.println("someInt " + someInt);
        System.out.println("someShort " + someShort);

        double someDouble = myFloatValue;
        System.out.println("someDouble " + someDouble);


        double someIntToDouble = someInt;
        System.out.println("someIntToDouble = " + someIntToDouble);

        double someLongToDouble = myLongValue;
        System.out.println("someLongToDouble = " + someLongToDouble);

        long someDoubleToLong = (long) someLongToDouble;
        System.out.println("someDoubleToLong = " + someDoubleToLong);
    }
}
