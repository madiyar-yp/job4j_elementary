package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl = isEven(1);
        System.out.println(rsl);
        rsl = isPositive(2);
        System.out.println(rsl);
        rsl = notEven(3);
        System.out.println(rsl);
        rsl = notPositive(4);
        System.out.println(rsl);
        rsl = notEvenAndPositive(5);
        System.out.println(rsl);
        rsl = evenOrNotPositive(6);
        System.out.println(rsl);
    }
}