package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + b);
        System.out.println(c);
    }
}
