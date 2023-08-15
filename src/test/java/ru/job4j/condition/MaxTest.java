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
}