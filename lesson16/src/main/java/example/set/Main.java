package example.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Boticelli");
        list.add("Leonardo");
        list.add("Giotto");
        Collections.sort(list);
        System.out.println(list);
    }
}
