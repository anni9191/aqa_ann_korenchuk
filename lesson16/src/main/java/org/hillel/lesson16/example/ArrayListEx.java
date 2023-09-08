package org.hillel.lesson16.example;

import java.util.ArrayList;
import java.util.List;

import static org.hillel.lesson16.example.ArrayListMain.printList;
public class ArrayListEx {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList<>();
        myFirstList.add("Hello");
        myFirstList.add(" World");
        myFirstList.add(" !");
        myFirstList.add("Hello");

        myFirstList.remove("Hello");

        printList(myFirstList);
    }
}
