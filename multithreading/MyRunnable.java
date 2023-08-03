package multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

for(int i=0;i<=5;i++)
{
	System.out.println("this thread is created by implementing runnable interface");
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	}

}
