package org.example.homework6;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        //У вас на банковском счету N долларов.
        //Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем
        //текущей суммы на счету и меньше текущей суммы.
        //Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
        //чтобы забрать все свои деньги из банка?
        //Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество денег на счету");
        int allAmount = scanner.nextInt();
        int days = 0;
        while (allAmount > 1) {
            int d = finMaxDivider(allAmount);
            allAmount -= d;
            days++;
        }

        System.out.println("Чтобы забрать все свои деньги из банка потребуется " + days + " дней.");
    }
    private static int finMaxDivider(int num) {
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
