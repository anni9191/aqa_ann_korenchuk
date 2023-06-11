package org.hillel.lessons;
//     Задача 3.
//     Создайте программу, вычисляющую факториал натурального числа n,
//     которое пользователь введёт с клавиатуры.
//     https://javarush.ru/groups/posts/klass-scanner
//     Факториал числа n — это произведение натуральных чисел от 1 до n.
//     Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3


import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        int a;
        long b = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");

        if (scn.hasNextInt()) {

            a = scn.nextInt();

            for (int i = a; i > 0; i--) {
                b *= i;
            }
            System.out.println("Факториал числа " + a + " равен " + b);
        } else System.out.println("Ошибка. Вы ввели не число");

    }
}
