package com.hillel;

public class MainStringUsefullMethods {

    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l'};
        String str = new String(arr);

        char c = str.charAt(0);
        char c1 = arr[0];
//        System.out.println(c);
//        System.out.println(c1);

        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str2==str1);
        System.out.println(str1.equals(str2));

        String str3 = "Hel lo ";
        System.out.println(str3.trim());




    }
}
