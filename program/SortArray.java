package program;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 1, 9, 3 };
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
