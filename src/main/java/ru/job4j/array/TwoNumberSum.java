package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == target) {
                return new int[] {left, right};
            } else if (array[left] + array[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = TwoNumberSum.getIndexes(new int[] {1, 3, 4, 8, 9 }, 4);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}