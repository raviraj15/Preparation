package program;

import java.util.Arrays;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] evenNumbers = Arrays.stream(numbers)
                                  .filter(n -> n % 2 == 0)
                                  .toArray();
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }
}
