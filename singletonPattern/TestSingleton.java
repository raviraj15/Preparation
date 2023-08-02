package singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		
		MySingleton singleton = MySingleton.getSingleton();
		
		System.out.println(singleton.hashCode());
		
		MySingleton singleton2 = MySingleton.getSingleton();
		
		System.out.println(singleton2.hashCode());
		
		
		
		
		System.out.println("breaking singleton pattern by using serialization");

		//serialization
		FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\Neosoft\\Desktop\\New folder (2)/singleton.txt");
		
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(singleton);
		objectOutputStream.close();
		
		//deserialization
		
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Neosoft\\Desktop\\New folder (2)/singleton.txt");
		
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		
		MySingleton readObject =(MySingleton) objectInputStream.readObject();
		
		System.out.println(singleton.hashCode());
		System.out.println(readObject.hashCode());
		
		
		System.out.println("breaking by using cloning");
		
		MySingleton clone =(MySingleton) singleton.clone();
		
		System.out.println(singleton.hashCode());
		System.out.println(clone.hashCode());
		
		
		
		
	}


}







