package serializattion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	
	public static void main(String[] args) throws IOException {
		
		Student student = new Student("raviraj","pune");
		
	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Neosoft\\Desktop\\New folder (2)/demo.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(student);
		
		oos.close();
		fos.close();
		
		System.out.println("serialization is done");
	}
}
