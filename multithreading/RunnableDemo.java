package multithreading;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable);
		t.start();
	}

}
