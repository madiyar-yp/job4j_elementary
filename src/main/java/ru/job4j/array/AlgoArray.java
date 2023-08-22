package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[3];
        array[3] = array[0];
        array[0] = temp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                array[i] = i + 1;
            }
        }

        for (int num : array) {
            System.out.println(num);
        }
    }
}