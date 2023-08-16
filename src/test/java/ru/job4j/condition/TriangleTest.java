package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TriangleTest {
    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isFalse();
    }
}