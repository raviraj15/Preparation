package program;

import java.util.Arrays;
//Sum of the first and second lowest numbers
public class SumOfLowestNumbers {

	
	public static void main(String[] args) {
		
		int [] numbers= {1,3,5,7,9};
		int [] b= {12,12,34,54,56};
		
		int sumOfTwoLowestNumbers = SumOfLowestNumbers.sumOfTwoLowestNumbers(b);
		System.out.println("sum of two lowest numbers is "+sumOfTwoLowestNumbers);
		
	}
	public static int sumOfTwoLowestNumbers(int [] num)
	{
		if(num.length<2)
		{
			throw new IllegalArgumentException("size of array must be more than two");
		}
		
		Arrays.sort(num);
		
		int sum=num[0]+num[1];
		return sum;
	}
	
}



















