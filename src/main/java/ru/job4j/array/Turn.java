package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            for (int j = array.length - 1; j > i; j--) {
                if (i + j == array.length - 1) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}