package org.hillel.lesson16.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList<>();
        myFirstList.add("Hello");
        myFirstList.add("World");
        myFirstList.add("!");
   /*   System.out.print( myFirstList.get(0));
        System.out.print( myFirstList.get(1));
        System.out.print( myFirstList.get(2));*/



/*
        myFirstList.set(0, "New Hello!");

        System.out.print( myFirstList.get(0));
        System.out.print( myFirstList.get(1));
        System.out.print( myFirstList.get(2));*/

/*        myFirstList.remove("World");


        System.out.print( myFirstList.get(0));
        System.out.print( myFirstList.get(1));

        System.out.println(myFirstList.size());

        System.out.println(myFirstList.isEmpty());*/

        printList(myFirstList);

        List<String> newArr = new ArrayList<>(myFirstList);

        printList(newArr);

        myFirstList.add(" new");

        printList(newArr);





   /*     List<String> newArr = new ArrayList<>(myFirstList);

        System.out.print( newArr.get(0));
        System.out.print( newArr.get(1));
        System.out.print( newArr.get(2));

        myFirstList.add(" new");*/


    }

    public static void printList(List<String> strings){
        System.out.println("________________");
        for (String s : strings){
            System.out.print(s);
        }
        System.out.println("________________");

    }
}