package threadDemo;

public class NewApp {

	public static void main(String[] args) {
		newThread n1 = new newThread();
		newThread n2 = new newThread();
		
		Thread t1 = new Thread(n1, "Thread1");
		Thread t2 = new Thread(n2, "Thread2");
		
		t1.start(); // Starting the thread - RUNNABLE
		t2.start(); // Starting the thread - RUNNABLE
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
