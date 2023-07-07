package org.hillel.builder;

public class NemnogoBuildera {

    public static void main(String[] args) {

       StringBuilder stringBuilder1 = createSomeString(3,56);
        System.out.println(stringBuilder1);

    }

    private static StringBuilder createSomeString (int a, int h) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(h).append(" = ").append(a + h).append("\n").deleteCharAt(7).insert(8, "равно ")
        .append(a).append(" - ").append(h).append(" = ").append(a - h).append("\n").replace(24,25, " равно")
        .append(a).append(" * ").append(h).append(" = ").append(a * h).append("\n");
        return result;



    }




}
