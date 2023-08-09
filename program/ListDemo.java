package program;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	//create list of integers and add numbers into list as below 
	//{10,23,90,78,90,12,10} any number which is < or = 15 must be moved to end of list  
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(23);
		list.add(90);
		list.add(78);
		list.add(90);
		list.add(12);
		list.add(10);
		
		ListDemo.moveNumbers(list);
		System.out.println(list);
		
	}
	
	public static void moveNumbers(List<Integer> l)
	{
		List<Integer> lessThanEqual15=new ArrayList<>();
		List<Integer> moreThan15=new ArrayList<>();
		
		for(int i:l)
		{
			if(i<=15)
			{
				lessThanEqual15.add(i);
			}
			else
			{
				moreThan15.add(i);
			}
		}
		
		l.clear();
		l.addAll(moreThan15);
		l.addAll(lessThanEqual15);
		
	}
}














