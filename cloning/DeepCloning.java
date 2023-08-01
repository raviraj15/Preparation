package clonable;

public class DeepCloning {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		 * Cat cat = new Cat(11);
		 * 
		 * 
		 * Dog dog = new Dog(cat,22);
		 * 
		 * System.out.println(dog.cat.c+"  "+dog.d);
		 * 
		 * 
		 * Dog clone =(Dog) dog.clone();
		 * 
		 * // System.out.println(clone.cat.c+"  "+clone.d);
		 * 
		 * dog.cat.c=111; dog.d=222; System.out.println(dog.cat.c+"  "+dog.d);
		 * System.out.println(clone.cat.c+"  "+clone.d);
		 */
		
		
	 Car car = new Car("alto");
	 
	 Vehical vehical = new Vehical("yellow",car);
	 
	 System.out.println(vehical.car.name+" "+vehical.color);
	 
	 Vehical clone =(Vehical) vehical.clone();
	 
	 System.out.println(clone.car.name+" "+clone.color);
		
	 vehical.car.name="maruti";
	 vehical.color="blue";
	 System.out.println(vehical.car.name+" "+vehical.color);
	 
	 System.out.println(clone.car.name+" "+clone.color);
		
		
		
		
	}
}








