package code.example;

public class BuilderMain {

    public static void main(String[] args) {
        String k = "Hello java";
        StringBuilder stringBuilder = new StringBuilder("Hello java");
        stringBuilder.insert(10, '!');
        stringBuilder.setCharAt(9,'!');
        System.out.println(stringBuilder);

    }
}
