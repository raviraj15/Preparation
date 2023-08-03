package checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//file not found exception handling
public class Test1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream
					("C:\\Users\\Neosoft\\Desktop\\New folder (2)/temo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file does not exist");
		}
		
		
	}
}
