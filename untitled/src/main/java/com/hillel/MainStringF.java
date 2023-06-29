package com.hillel;

public class MainStringF {

    public static void main(String[] args) {
        String k = "Hello";
        int x = 10;

        System.out.println(k + " " + x + " times!");
        String print = String.format("%s %d times!", k, x);
        System.out.println(print);
    }
}
