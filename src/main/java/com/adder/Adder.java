package com.adder;

public class Adder {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int a = 5;
        int b = 2;

        add(a,b);
    }

    public static int add(int a, int b) {
        int c = a + b;
        System.out.println( a + " + " + b + " = " + c);
        return c;
    }

}