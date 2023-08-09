package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0,0,2,0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(-2,9,9,6);
        System.out.println("result (-2, 9) to (7, 6) " + result);
        result = Point.distance(2,1,5,3);
        System.out.println("result (2, 1) to (5, 3) " + result);
        result = Point.distance(6,9,2,3);
        System.out.println("result (6, 9) to (2, 3) " + result);
    }
}
