package ru.netology.sqr;

public class SQRService {
    public int number(int minValue, int maxValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue) {
                if (i * i <= maxValue) {
                    counter = counter + 1;
                }
            }
        }
        return counter++;
    }
}