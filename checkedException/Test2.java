package checkedException;

//class not found
public class Test2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("Test1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class is not found with the given name");
		}
	}
}
