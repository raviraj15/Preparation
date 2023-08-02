package immutableClass;

import java.util.Collections;
import java.util.List;

public final class Student {// no one can extend this class

	private final String name; // no one can directly access this variable and we cant reassign

	private final String city;

	private final Address address;
	
	private final List<String> myList;

	
	
	 

	// we have to take getters to get these values
	// we dont have to give setter because we cant set or change the value once it
	// is created

	

	public Student(String name, String city, Address address, List<String> myList) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
		this.myList = myList;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	
	
	/*
	 * public Address getAddress() { return new
	 * Address(address.getCity(),address.getState()); }
	 */
	 
	 
	
	 public Address getAddress() { return address; }
	 
	  
		public List<String> getMyList() {
		return myList;
			// return Collections.unmodifiableList(myList);
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", city=" + city + ", address=" + address + ", myList=" + myList + "]";
		}

	



}
