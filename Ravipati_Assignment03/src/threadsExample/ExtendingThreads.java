package threadsExample;

public class ExtendingThreads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThreads t1 = new ExtendingThreads();
		t1.start();
		System.out.println("Runs Outside the Thread");
	}

	public void run() {
		System.out.println("Runs Inside the Thread");
	}
}


