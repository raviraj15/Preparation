package immutableClass;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Address address = new Address("pune", "MH");
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("india");
		arrayList.add("SA");
		
		Student student = new Student("raviraj","pune", address,arrayList);
		
		System.out.println(student);
		
		Address address2 = student.getAddress();
		
		System.out.println(address2);
		address2.setCity("surat");
		address2.setState("GJ");
		
		List<String> myList = student.getMyList();
		myList.set(0,"Australia");
		myList.set(1,"WI");
		System.out.println(student);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	/*
	 * Address address = new Address("pune","MH");
	 * 
	 * Employee employee = new Employee(103,"raj",address);
	 * 
	 * System.out.println(employee);
	 * 
	 * Address address2 = employee.getAddress();
	 * 
	 *  address2.setCity("nashik");
	 * address2.setState("MH");
	 *  System.out.println(employee);
	 */

	/*
	 * Address address3 = new Address("pune","MH");
	 * 
	 * 
	 * Student student = new Student("ravi", "pune",address3);
	 * 
	 * Address address2 = student.getAddress();
	 * 
	 * System.out.println(student);
	 * 
	 * address2.setCity("banglore"); address2.setState("karnatak");
	 * 
	 * 
	 * System.out.println(student);
	 
	  //executeString(null);
}

}
}
