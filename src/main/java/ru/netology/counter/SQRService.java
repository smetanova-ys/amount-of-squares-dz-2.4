package ru.netology.counter;

public class SQRService {
    public int count(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
