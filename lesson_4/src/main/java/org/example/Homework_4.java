package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Homework_4 {

    public static void main(String[] args) {
        //      Задача 1.
        //      Во многих странах для измерения небольших размеров используется не только
        //      единица длины «сантиметр», но и такая единица,
        //      как «дюйм» (1 дюйм = 2.54 сантиметра).
        //      Выведите в консоль 10 см,равное размеру в дюймах,
        //      и затем 25 дюймов,но в сантиметрах.


        double cm = 10;
        double inches = cm / 2.54;
        System.out.println("10cm = " + inches + "dm");

        inches = 25;
        cm = inches * 2.54;
        System.out.println("25dm = " + cm + "cm");

        System.out.println("---------------------");


 /*     Задача 2.
        Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу,
        а родители добавили ему от себя еще некоторую сумму.
        Выведите в консоль сколько денег есть у Васи на отпуск (в евро) если:
        Вася заработал 5000 грн,Родители добавили-5000,
        курс евро 1 евро = 28 грню
*/
       Scanner s = new Scanner (System.in);
        System.out.print("Введите заработанную сумму: ");

        int a = s.nextInt();
        System.out.print("Введите сколько добавили: ");

        int b = s.nextInt();
        System.out.print("Введите курс евро к гривне: ");

        double exchange = s.nextDouble();
        double sum = (a + b) / exchange;
        System.out.println("Сумма денег у Васи на отпуск: " + sum + "EUR");
        System.out.println("--------------");

        s.close();


/*      Задача 3.
        Если x любое положительное двузначное число
        Выведите на екран его десятки и еденицы (2 числа)
        разделенные знаком «пробел», но в обратном порядке.
        То есть для числа 45 будет выведено на экран 5 4.
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое двузначное положительное число: ");
        int x = sc.nextInt();

        if (x>9 && x<100) {
            int units = x % 10;
            int dozens = x / 10;
            System.out.println(units + " " + dozens );
        }
        System.out.println("--------------");



/*      Задача 4.
        Если x любое положительное двузначное число
        Выведите на екран его в «полном виде»: например,
        для числа 34 это будет выглядеть как 30+4.
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительное двузначное число: ");
        int x = sc.nextInt();

        if (x>9 && x<100) {
            int units = x % 10;
            int dozens = x - units;
            System.out.println(dozens + " + " +units);
        }
        System.out.println("--------------");


/*      Задача 5.
        Назовем весом числа сумму его цифр.
        Если x любое положительное двузначное число
        Выведите на екран его «вес».
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительное двузначное число: ");
        int x = sc.nextInt();

        if (x>9 && x<100) {
            int units = x % 10;
            int dozens = x / 10;

            System.out.println(units + dozens);
        }
        System.out.println("--------------");

/*      Задача 6.
        Если x любое число,выведите на экран одно из следующих сообщений:
        Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.
*/
        Scanner s = new Scanner (System.in);
        System.out.print("Введите любое число: ");
        int a = s.nextInt();


        if(a > 0){
            System.out.println("Вы ввели положительное число");
        }else if (a < 0){
        System.out.println("Вы ввели отрицательное число");
        } else {
            System.out.println("Вы ввели 0");

        }
        System.out.println("--------------");

/*      Задача 7.
        Если x любое число,
        если оно как минимум трехзначное и положительное,
        уменьшает его на 1 и выводит на экран.
*/
        Scanner s = new Scanner (System.in);
        System.out.print("Введите трехзначное положительное число: ");
        int x = s.nextInt();

        if (x>99 && x<999) {
            System.out.println(--x);
        }
        System.out.println("--------------");


/*      Задача 8.
        Если x любое положительное двузначное число выведите на экран что больше:
        само это число или произведение его цифр.
 */
        Scanner s = new Scanner(System.in);
        System.out.print("Введите положительное двухзначное число: ");
        int x = s.nextInt();

        if (x > 9 && x < 100) {
            int units = x % 10;
            int result = units * (x / 10);

            if (x > result) ;
            System.out.println("Произведение цифр больше");
        } else {
            System.out.println("Число больше");


        }


    } }
