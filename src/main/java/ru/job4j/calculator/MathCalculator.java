package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(20, 10));
        System.out.println("Результат расчета равен: " + sumOfAllOperations(20, 10));
    }
}