package org.example.homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое их трёх чисел");
        int num1 = scanner.nextInt();
        System.out.println("Введите пвторое их трёх чисел");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье их трёх чисел");
        int num3 = scanner.nextInt();
        getMaxNumb(num1, num2, num3);
    }
    public static void getMaxNumb (int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("Max number " + num1);
        } else if (num2 > 1 && num2 > num3) {
            System.out.println("Max number " + num2);
        } else {
            System.out.println("Max number " + num3);
        }

    }
}
