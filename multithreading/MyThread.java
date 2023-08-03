package multithreading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("this thread is created by extending thread class");
			
		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

}
}