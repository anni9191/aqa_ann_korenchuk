package org.hillel.lessons;
import java.util.Scanner;

public class code_example {
    public static void main(String[] args) {
/*        int x = 10;
        String output;
        if (x > 0) {
            output = ("x больше нуля");
        } else {
            output = ("x меньше нуля");
        }

        output = x > 0 ? "x больше нуля" : "x меньше нуля";

        System.out.println(output);
*/

        int u = 0;
        while (u <= 100) {
            System.out.println("Hello " +u);
            u++;
        }
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            System.out.println("Scanner " + scanner.nextInt());
        }
        }
    }
