package org.example.homework7;

import java.util.Arrays;
import java.util.Random;

public class Arr1 {
    public static void main(String[] args) {
        //Создайте массив из 8 случайных целых чисел из интервала [1;50]
        //Выведите массив на консоль в строку.
        //Замените каждый элемент с нечетным индексом на ноль.
        //Снова выведете массив на консоль в отдельной строке.
        int[] randArr = new int[8];
        Random random = new Random();

        for (int i = 0; i < randArr.length ; i++) {
            randArr[i] = random.nextInt(50) + 1;
        }
        System.out.println(Arrays.toString(randArr));

        for (int i = 0; i < randArr.length ; i = i + 2) {
            randArr[i] = 0;
        }
        System.out.println(Arrays.toString(randArr));
    }
}
