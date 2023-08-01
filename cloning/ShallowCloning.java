package clonable;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * Cat c1=new Cat(10) ; Dog d1=new Dog(c1 , 20) ;
		 * System.out.println(d1.cat.c+" "+d1.d );
		 * 
		 * 
		 * Dog d2 =(Dog) d1.clone();
		 * 
		 * d1.cat.c=100; d1.d=200;
		 * 
		 * System.out.println(d2.cat.c+" "+d2.d );
		 */

		
		  Car c1 = new Car("BMW");
		  
		  Vehical vehical = new Vehical("red", c1);
		  
		  System.out.println(vehical.car.name + "  " + vehical.color);
		  
		  Vehical clone = (Vehical) vehical.clone();
		  
		  System.out.println(clone.car.name + "  " + clone.color);
		  
		  vehical.car.name="swwift"; vehical.color="white";
		  System.out.println(vehical.car.name + "  " + vehical.color);
		  
		  System.out.println(clone.car.name + "  " + clone.color);
		 
		

	}
}