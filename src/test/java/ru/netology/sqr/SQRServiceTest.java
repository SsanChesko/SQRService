package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"400, 1000, 12", "200, 300, 3", "1, 99, 0", "1, 100, 1"})
    void shouldSum(int minValue, int maxValue, int expected) {

        SQRService service = new SQRService();

        int actual = service.number(minValue, maxValue);

        assertEquals(expected, actual);
    }


    @Test
    void shouldSqr() {

        SQRService service = new SQRService();

        int minValue = 400;
        int maxValue = 1000;
        int expected = 12;

        int actual = service.number(minValue, maxValue);

        assertEquals(expected, actual);
    }
}

