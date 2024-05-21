package org.example;

public class HW1 {
    public static void main(String[] args) {
//        Создайте строку через new - I study Basic Java!
//        Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку,
//        которую создали в п.1
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        Вырезать строку Java c помощью метода String.substring().
//        Заменить все символы “а” на “о”.
//        Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.
        String str = new String("I study Basic Java!");
        int lastIndex = str.length() - 1;
        char preLastCharacter = str.charAt(lastIndex - 1);
        System.out.println("Пред-последний символ строки - " + preLastCharacter);
        boolean strContains = str.contains("Java");
        System.out.println("Строка содержит подстроку Java: " + strContains);
        System.out.println("Substring - " + str.substring(14, 18));
        String replasedJava = str.replace("a", "o");
        System.out.println(replasedJava);
        System.out.println("К верхнему регистру " + str.toUpperCase());
        System.out.println("К нижнему регистру " + str.toLowerCase());
    }
}
