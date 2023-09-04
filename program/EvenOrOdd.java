package Test;

import java.util.stream.IntStream;

public class EvenOrOdd {

	public static boolean checkEvenOrOdd(int number)
	{
		if(number%2==0)
		{
			return true;
		}
		return false;
	}
	public static boolean checkPrime(int num1)
	{
		if(num1<=1)
		{
			return false;
		}
		return IntStream.range(2,(int) Math.sqrt(num1)+1).noneMatch((i)->num1%i==0);
	}
	
	public static void main(String[] args) {
		
		int num=31;
		
		if(EvenOrOdd.checkPrime(num))
		{
			System.out.println(num+" is  prime number");
		}
		else
		{
			System.out.println(num+" is not ptime number");
		}
		
		
		/*
		 * if(EvenOrOdd.checkEvenOrOdd(num)) {
		 * System.out.println(num+" is even number"); } else {
		 * System.out.println(num+" is odd number"); }
		 */
	}
}
