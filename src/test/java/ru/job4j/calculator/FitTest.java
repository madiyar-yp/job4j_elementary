package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan187Then100dot05() {
        short height = 187;
        double expected = 100.05;
        double rsl = Fit.manWeight(height);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void womanWoman168Then66dot69() {
        short height = 168;
        double expected = 66.69;
        double rsl = Fit.womanWeight(height);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}