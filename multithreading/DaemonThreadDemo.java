package multithreading;

public class DaemonThreadDemo {

	public static void main(String[] args) {
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true);; 
        daemonThread.start();

       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        synchronized (daemonThread) {
            daemonThread.notifyAll();
        }

        System.out.println("Main thread End.");
    }
}
