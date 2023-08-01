package clonable;

public class Vehical implements Cloneable{
	
	String  color;
    Car car;
    
    
	public Vehical(String color, Car car) {
		super();
		this.color = color;
		this.car = car;
	}
    
    
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { //
	 * return super.clone(); }
	 */
	 
	
	
	
	  @Override protected Object clone() throws CloneNotSupportedException {
	  
	  Car car2 = new Car(car.name);
	  
	  Vehical vehical2 = new Vehical(color,car2);
	  
	  return vehical2;
	  }
	 
	 
}
