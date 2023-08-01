package serializattion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Neosoft\\Desktop\\New folder (2)/demo.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Student readObject =(Student) ois.readObject();
	
		System.out.println(readObject.getName());
		System.out.println(readObject.getCity());
		
	}
}
