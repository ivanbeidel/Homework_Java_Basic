package org.example.homework2;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println("Сумма чисел равна " + addTwoNumbers(17, 69));
        System.out.println("Разность чисел равна " + subtractTwoNumbers(17, 69));
        System.out.println("Произведение чисел равна " + multiplyTwoNumbers(17, 69));
        divideTwoNumbers(17, 9);

    }

    public static double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public static double subtractTwoNumbers(double a, double b) {
        return a - b;
    }

    public static double multiplyTwoNumbers(double a, double b) {
        return a * b;
    }

    public static void divideTwoNumbers(double a, double b) {
        if (b == 0) { System.out.println("На ноль делить нелья");
        } else {
            System.out.println(("Частное чисел равно " + (a / b)));
        }
    }
}
