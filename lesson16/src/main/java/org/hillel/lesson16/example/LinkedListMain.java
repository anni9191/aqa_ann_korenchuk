package org.hillel.lesson16.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Hell");
        list.add(" World");
        list.add(" !");
//        list.add(0, " World");
        System.out.println(list);
        System.out.println(list.get(2));

    }
}