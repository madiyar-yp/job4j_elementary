package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenX10Y10X22Y20Then2dot0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX12Y1minus7X29Y26Then14dot76() {
        int x1 = 2;
        int y1 = -7;
        int x2 = 9;
        int y2 = 6;
        double expected = 14.76;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX12Y11X25Y23Then3dot60() {
        int x1 = 2;
        int y1 = 1;
        int x2 = 5;
        int y2 = 3;
        double expected = 3.60;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}