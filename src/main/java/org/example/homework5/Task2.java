package org.example.homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
       isLeap(year);

    }
    public static void isLeap(int year) {
        if (((year % 4 == 0) &&
                !(year % 100 == 0))
                || (year % 400 == 0)) {
            System.out.println("Это високосный год");
        }
        else {
            System.out.println("Это НЕ високосный год");
        }
    }
}
