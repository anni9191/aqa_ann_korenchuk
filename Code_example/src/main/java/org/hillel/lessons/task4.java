package org.hillel.lessons;


//     Задача 4.
//     Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//     (заранее не известно сколько цифр будет в числе).


import java.util.Scanner;
public class task4 {

    public static void main(String[] args){
        int a,c=0;
        java.util.Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            a=scn.nextInt();
            while(a!=0){
                c=c+a%10;
                a/=10;
            }

            System.out.println("Сумма всех чисел введенного числа равна "+c);
        }
        else System.out.println("Ошибка. Вы ввели не число!");
    }
}

