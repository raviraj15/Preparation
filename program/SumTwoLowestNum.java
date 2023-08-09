package program;

import java.util.Arrays;

//sum of two lowest numbers using java8
public class SumTwoLowestNum {

	
	public static void main(String[] args) {
		
		int [] num= {3,5,4,7,8,9};
		
		int sumTwoLowest = SumTwoLowestNum.sumTwoLowest(num);
		
		System.out.println(sumTwoLowest	);
	}
	
	public static int sumTwoLowest(int [] numbers)
	{
		if(numbers.length<2)
		{
			throw new IllegalArgumentException("size of array must be minimum two");
		}
		
		int[] array = Arrays.stream(numbers).distinct().sorted().limit(2).toArray();
		
		int sum = Arrays.stream(array).sum();
		
		return sum;
	}
}
