package clonable;

public class Dog  implements Cloneable{

	 int d ;
	  Cat cat;
	  
	  
	  Dog(Cat cat , int d) {
	  this.cat=cat ;
	  this.d=d ;
	  }
	  
	  
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	  
	  }

