package program;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        double average = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Average of array elements: " + average);
    }
}
