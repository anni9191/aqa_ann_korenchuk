package org.example;

public class Cast {
    public static void main(String[] args) {
        // char
        char a = 'a';
        // integers
        byte b = 126;
        short sh = 250;
        int i = 600;
        long l = 4555590234849837503L;
        //pointed
        float f = 10.1234567f;
        double d = 11.12345678901234567d;

        int castByteToInt = b;
        int castShortToInt = sh;
        int castFloatToInt = (int) f;

        double castFloatToDouble = f;
        float castDoubleToFloat = (float) d;


        System.out.println(castFloatToInt);

    }
}
