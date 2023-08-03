package checkedException;

public class ExceptionTest {
	
	public static void methodForCheckedException() throws MyCheckedException
	{
		//System.out.println("this is checked exception method");
		throw new MyCheckedException();
	}
	
	public static void methodForUnheckedException() throws MyUncheckedException
	{
		throw new MyUncheckedException();
	}

	
	public static void main(String[] args) {
		try {
			ExceptionTest.methodForCheckedException();
		} catch (MyCheckedException e) {
			e.getMessage();
		}
		try
		{
		ExceptionTest.methodForUnheckedException();
		}
		catch(MyUncheckedException e)
		{
			e.getMessage();
		}
	}
}
