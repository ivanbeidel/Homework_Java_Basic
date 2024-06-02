package org.example.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        //Числа могут быть, как целочисленные, так и дробные.
        //Например :
        //ввод : m=10.5, n=10.45
        //вывод: Число 10.45 ближе к 10.
        double centerNum = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите перевое число");
        double numFirst = scanner.nextDouble();
        System.out.println("Введите второе число");
        double numSecond = scanner.nextDouble();
        System.out.println(comparingNum(numFirst, centerNum, numSecond));
    }
    public static double comparingNum(double num1, double centerNum, double num2) {
        double diff1 = num1 - centerNum;
        double diff2 = num2 - centerNum;
        if (diff1 < 0) {
            diff1 = -diff1;
        }
        if (diff2 < 0) {
            diff2 = -diff2;
        }
        if (diff1 < diff2) {
            System.out.println("Число " + num1 + "ближе к " + centerNum);
            return num1;
        } else if (diff2 < diff1) {
            System.out.println("Число " + num2 + "ближе к " + centerNum);
            return num2;
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равноудалены от " + centerNum);
            return centerNum;
        }
    }
}
