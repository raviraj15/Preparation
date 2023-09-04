package Test;

public class Palindrom {

	public static void main(String[] args) {
		
		String str="sir";
		
		char[] c = str.toCharArray();
		
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		if(str.equals(rev))
		{
			System.out.println("given string is palindrom");
		}
		else
		{
			System.out.println("given string is not palindrom");
		}
	}
}
