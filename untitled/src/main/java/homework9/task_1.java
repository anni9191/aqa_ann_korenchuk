package homework9;

public class task_1 {
    public static void main(String[] args) {

        String str = "I like Java!!!";
        System.out.println(str);

//      compareString("I like Java!!!");
//      compareString("I like Pyton!!!");
//      compareString("I hate C++!!!");

        char c = "I like Java!!!".charAt(13);
//        System.out.println(c);


    }

    private static void compareString(String str) {
//        System.out.println(str.endsWith("!!!"));
//        System.out.println(str.startsWith("I like"));
//        System.out.println(str.contains("Java"));


        String h = "I like Java!!!";
/*
       System.out.println("indexOf(Java) = " + h.indexOf("Java"));
       System.out.println("I like Java!!!".replace('a', 'o'));
       System.out.println("I like Java!!!".toLowerCase());
       System.out.println("I like Java!!!".toUpperCase());
       System.out.println("I like Java!!!".replace('a', 'o'));
       System.out.println("I like Java!!!".toLowerCase());
       System.out.println("I like Java!!!".toUpperCase());
*/


        System.out.println("I like Java!!!".substring(7, 11));
    }
}




