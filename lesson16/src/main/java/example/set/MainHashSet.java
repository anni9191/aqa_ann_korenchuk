package example.set;

import example.realization.Painter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainHashSet {

    public static void main(String[] args) {
//        Set<String> set1 = new HashSet<>();
//        set1.add("Hello");
//        set1.add("Hello");
//        set1.add("Hello");
//        System.out.println(set1);

        Set<Painter> people = new HashSet<>();

        people.add(new Painter("Boticelli", 35));
        people.add(new Painter("Leonardo", 35));
        people.add(new Painter("Leonardo", 35));
        people.add(new Painter("Rafaello", 35));
        people.add(new Painter("Mickelangelo", 45));
        people.add(new Painter("Ticiano", 25));
        people.add(new Painter("Lippi", 30));
        people.add(new Painter("Donatello", 33));
        people.add(new Painter("Giotto", 42));

        Painter p1 = new Painter("Leonardo", 35);
        Painter p2 = new Painter("Leonardo", 35);
       System.out.println(p1.equals(p2));
        System.out.println(people);
        System.out.println(getPersonByName("Leonardo", people));
        System.out.println(people.contains(p1));


        System.out.println(getPersonByName("Leonardo", people));



    }

    public static Painter getPersonByName(String name, Set<Painter> people) {
        for (Painter p : people) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
