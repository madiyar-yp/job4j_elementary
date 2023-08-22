package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = i * i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] rsl = Square.calculate(4);
        for (int num : rsl) {
            System.out.println(num);
        }
    }
}