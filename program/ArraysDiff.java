package program;

import java.util.Arrays;
import java.util.Comparator;

//find the difference between  highest and 2nd highest number from given integer array
public class ArraysDiff {

	public static void main(String[] args) {
		
		int [] numbers= {2,4,6,8,9};
		
		int sumTwoHighest = ArraysDiff.SumTwoHighest(numbers);
		
		System.out.println(sumTwoHighest);
	}
	 public static int findDifferenceBetweenHighestNumbers(int[] numbers) {
	        if (numbers.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least 2 numbers.");
	        }

	        // Find the highest and second highest numbers using streams and max()
	        int[] highestNumbers = Arrays.stream(numbers)
	                .distinct() // Remove duplicates if any
	                .sorted()
	                .skip(numbers.length - 2) // Skip all but the last two numbers
	                .toArray();

	        // Calculate the difference between the highest and second highest numbers
	        int difference = highestNumbers[1] - highestNumbers[0];

	        return difference;
	    }
	
	
	  public static int SumTwoHighest(int [] num) { if(num.length<2) { throw new
	  IllegalArgumentException("size of array must be min two"); }
	  
	  int[] array = Arrays.stream(num).distinct(). sorted().skip(num.length - 2).toArray();
	  
	  int diff=num[1]-num[0];
	  
	  return diff; }
	 
}
