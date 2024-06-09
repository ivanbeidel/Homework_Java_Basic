package org.example.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Представим, что у нас есть устройство, в котором две колбы.
        //Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
        //Вы должны написать метод, который проверяет это устройство.
        //Ваша программа должна иметь переменные temperature1 и temperature2.
        //В результате метод возвращает true или false.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температруру первой колбы");
        int temperature1 = scanner.nextInt();
        System.out.println("Введите температруру второй колбы");
        int temperature2 = scanner.nextInt();
        System.out.println("Программа работает? " + getProgramStatus(temperature1, temperature2));

    }
    public static boolean getProgramStatus(int temp1, int temp2){
        if(temp1 > 100 && temp2 < 100) {
            return true;
        }
        return false;
    }
}
