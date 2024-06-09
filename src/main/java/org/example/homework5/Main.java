package org.example.homework5;

public class Main {
    public static void main(String[] args) {
        //1 уровень сложности: 1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        //Реализует логический метод canBuy,  возвращающий boolean
        //Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        //Отобразите строку «Я могу купить еду, это ……» и значение.
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        System.out.println(canBuy(isEdekaOpen, isReweOpen));
    }
    public static boolean canBuy (boolean Edeka, boolean Rewe) {
        if (Edeka == true) {
            System.out.println("Я могу купить еду, это Edeka");
            return true;
        } else if (Rewe == true) {
            System.out.println("Я могу купить еду, это Rewe");
            return true;
        }
        System.out.println("Я не могу купить еду, всё закрыто");
        return false;

    }
}
