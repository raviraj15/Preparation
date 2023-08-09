package program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstDuplicate {

	
//Find First duplicate number and print it int arr[]={16,19,21,25,21,5,8,10,25};?
	public static void main(String[] args) {
		
	
	int arr[]={16,19,21,25,21,5,8,10,25,25};
	int findDuplicate = FirstDuplicate.findDuplicate(arr);
	System.out.println(findDuplicate);

}
	public static int findDuplicate (int [] ar)
	{
		Set<Integer> set=new HashSet<>();
		
		for(int i:ar)
		{
			if(set.contains(i))
			{
				return i;
			}
			else
			{
				set.add(i);
			}
		}
		return -1;
	}
	
}









