package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {
    @Test
    void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3To5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 3;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 6, 5, 4, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1To6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 7, 3, 4, 5, 6, 2, 8};
        assertThat(result).containsExactly(expected);
    }
}