package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int i = ivan;
        int n = nik;
        while (i <= n) {
            i *= 3;
            n *= 2;
            month += 1;
        }
        return month;
    }
}