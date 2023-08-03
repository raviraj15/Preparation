package checkedException;

public class MyCheckedException extends Exception {

	
	public MyCheckedException(String msg)
	{
		super(msg);
	}
	
	
	public MyCheckedException()
	{
		super("this is cheked exception");
	}
}
