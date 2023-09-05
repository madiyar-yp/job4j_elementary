package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int expected = 5;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax10To5To15Then15() {
        int first = 10;
        int second = 5;
        int third = 15;
        int expected = 15;
        int out = Max.max(first, second, third);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax10To25To20To5Then25() {
        int first = 10;
        int second = 25;
        int third = 20;
        int fourth = 5;
        int expected = 25;
        int out = Max.max(first, second, third, fourth);
        assertThat(out).isEqualTo(expected);
    }
}