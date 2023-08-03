package checkedException;

public class MyUncheckedException extends RuntimeException{
	
	public MyUncheckedException()
	{
		super("this is unchecked exception");
	}
	

	public MyUncheckedException(String msg)
	{
		super(msg);
	}


}
