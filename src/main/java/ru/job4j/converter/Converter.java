package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rublesToDollar(float value) {
        return value / 60;
    }

    public static float rublesToTenge(float value) {
        return value * 4.95f;
    }

    public static void main(String[] args) {
        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);

        in = 200f;
        expected = 3.3333333f;
        out = Converter.rublesToDollar(in);
        passed = expected == out;
        System.out.println("200 rubles are 3.3333333. Test result: " + passed);

        in = 21180f;
        expected = 104840.99f;
        out = Converter.rublesToTenge(in);
        passed = expected == out;
        System.out.println("21180 rubles are 104840.99. Test result: " + passed);
    }
}
