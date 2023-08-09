package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rublesToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rublesToTenge(float value) {
        float rsl = value * 4.95f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rublesToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");
        float tenge = Converter.rublesToTenge(21180);
        System.out.println("21180 rubles are " + tenge + " tenge.");
    }
}
