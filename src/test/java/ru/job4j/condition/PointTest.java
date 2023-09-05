package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void whenX10Y10X22Y20Then2dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 2.0;
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX12Y1minus7X29Y26Then14dot76() {
        Point a = new Point(2, -7);
        Point b = new Point(9, 6);
        double rsl = a.distance(b);
        double expected = 14.76;
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX12Y11X25Y23Then3dot60() {
        Point a = new Point(2, 1);
        Point b = new Point(5, 3);
        double rsl = a.distance(b);
        double expected = 3.60;
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}