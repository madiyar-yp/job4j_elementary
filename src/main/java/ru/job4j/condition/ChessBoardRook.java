package ru.job4j.condition;

public class ChessBoardRook {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    public static boolean isValid(int cordinate) {
        return cordinate >= 0 && cordinate <= 7;
    }

    public static void main(String[] args) {
        int rsl = ChessBoardRook.way(1, 0, 1, 5);
        System.out.println(rsl);
    }
}
