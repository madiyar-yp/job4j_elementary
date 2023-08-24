package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DigitSumTest {

    @Test
    void whenNum1Then1() {
        int num = 1;
        int result = DigitSum.sum(num);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNum12Then3() {
        int num = 12;
        int result = DigitSum.sum(num);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNum123Then6() {
        int num = 123;
        int result = DigitSum.sum(num);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNum1234Then10() {
        int num = 1234;
        int result = DigitSum.sum(num);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNum12345Then15() {
        int num = 12345;
        int result = DigitSum.sum(num);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}