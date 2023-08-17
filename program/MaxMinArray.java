package program;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 3, 12, 6 };
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
