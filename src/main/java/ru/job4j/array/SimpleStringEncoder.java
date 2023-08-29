package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        input += " ";
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol && counter > 1) {
                result = result + symbol + counter;
                symbol = input.charAt(i);
                counter = 1;
            } else if (input.charAt(i) != symbol && counter == 1) {
                result = result + symbol;
                symbol = input.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        return result;
    }
}