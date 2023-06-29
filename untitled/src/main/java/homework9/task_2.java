package homework9;

import java.util.Formatter;

public class task_2 {
    public static void main(String[] args) {
        print("Иванов", 5, "Математике");
        print("Петрова", 4, "Физике");
        print("Сидорова", 3, "Программированию");
        print("Коренчук", 5, "Программированию на любимой Java");

    }

    private static void print(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %s получил %d по %s", fullName, mark, subject);
        System.out.println(formatter);
    }
}
