package threadDemo;

public class App {

	public static void main(String[] args) {
		Account a = new Account(100);
		
		myThread t1 = new myThread("Thread 1", a, 200); // Creating thread - NEW
		myThread t2 = new myThread("Thread 2", a, -50); // Creating another thread - NEW state
		//myThread t3 = new myThread("Thread 3"); // Creating another thread - NEW state
		//myThread t4 = new myThread("Thread 4"); // Creating another thread - NEW state
		//myThread t5 = new myThread("Thread 5"); // Creating another thread - NEW state
		
		// Set Priority, aunque no le hace ni puto caso
		
		/*t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(6);
		t4.setPriority(4);
		t5.setPriority(2);*/
		
		t1.start(); // Starting the thread - RUNNABLE
		t2.start(); // Starting the thread - RUNNABLE
		//t3.start(); // Starting the thread - RUNNABLE
		//t4.start(); // Starting the thread - RUNNABLE
		//t5.start(); // Starting the thread - RUNNABLE
		
		// Scheduler will pick up the RUNNABLE thread and put them into CPU -> RUNNING state
		
		// t1.run(); no llamar nunca al metodo run 
		
		try {
			t1.join();
			t2.join();
			//t3.join();
			//t4.join();
			//t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int currentBalance = a.getBalance();
		System.out.println("The current Account Balance is: " + currentBalance);
		
		//System.out.println("At the end of Main Method");
		
	}

}