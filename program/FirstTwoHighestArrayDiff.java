package program;

import java.util.Arrays;

public class FirstTwoHighestArrayDiff {
	
	public static void main(String[] args) {
		
		int [] a= {2,4,6,7,8,12};
		int diff = FirstTwoHighestArrayDiff.diff(a);
		System.out.println(diff);
		
	}
	
	public static int diff(int [] num)
	{
		if(num.length<2)
		{
			throw new IllegalArgumentException("min size of array is 2");
		}
		
		int[] array = Arrays.stream(num).sorted().skip(num.length-2).toArray();
		
		int result=array[1]-array[0];
		
		return result;
	}

}
