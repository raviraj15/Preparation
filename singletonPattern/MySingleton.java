package singletonPattern;

import java.io.Serializable;

public class MySingleton implements Serializable,Cloneable {

	private static MySingleton mySingleton;
	
	
	private MySingleton()
	{
		
	}
	
	
	public static MySingleton getSingleton()
	{
		if(mySingleton==null)
		{
			return mySingleton=new MySingleton();
		}
		return mySingleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
