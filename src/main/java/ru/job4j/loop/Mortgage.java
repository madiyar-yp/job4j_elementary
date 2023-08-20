package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double debt = amount + (amount / 100) * percent;
        while (debt > 0) {
            debt -= salary;
            if (debt > 0) {
                debt = debt + (debt / 100) * percent;
            }
            year++;
        }
        return year;
    }
}