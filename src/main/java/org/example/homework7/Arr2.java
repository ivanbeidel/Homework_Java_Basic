package org.example.homework7;

import java.util.Arrays;
import java.util.Random;

public class Arr2 {
    public static void main(String[] args) {
        //Создайте массив из 5 случайных целых чисел из интервала [10;99]
        //Выведите его на консоль в строку.
        //Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        int[] randArr = new int[5];
        Random random = new Random();

        for (int i = 0; i < randArr.length ; i++) {
            randArr[i] = random.nextInt(90) + 10;
        }
        System.out.println(Arrays.toString(randArr));
        boolean isIncreasing = true;
        for (int i = 1; i < randArr.length; i++) {
            if (randArr[i] <= randArr[i - 1]){
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing == true) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}
