package org.hillel.lessons;


//    Задача 2.
//    Создайте программу, выводящую на экран
//    все неотрицательные элементы последовательности
//    10, 6, 2,-2,-6,-10
public class task2 {

    public static void main(String[] args) {
        for (int a = 10; a > 0; a -= 4) {
            System.out.print(a + " ");
        }
    }
}

