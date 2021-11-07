package ru.netology.counter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {"range from 0 to 99, 0, 99, 0", "range from 1 to 100, 1, 100, 1", "range from 200 to 300, 200, 300, 3", "range from 9400 to 9801, 9400, 9801, 3", "range from 9802 to 10000, 9802, 10000, 0"}
    )
    void shouldCount(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.count(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}