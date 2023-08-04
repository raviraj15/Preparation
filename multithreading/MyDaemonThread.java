package multithreading;

public class MyDaemonThread extends Thread
{
@Override
public void run() {
	 synchronized (this) {
         System.out.println("Daemon thread  waiting.");
         try {
             
             this.wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("Daemon thread ready");
     }

}


}
