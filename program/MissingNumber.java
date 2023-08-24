package program;

public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; 
        int expectedSum = n * (n - 1) / 2; 
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8};
        
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}