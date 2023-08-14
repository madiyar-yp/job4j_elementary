package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Bot, give me money.";
        String expected = "I don't know. Please, ask another question.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(expected);
    }
}