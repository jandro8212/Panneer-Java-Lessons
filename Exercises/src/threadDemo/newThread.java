package threadDemo;

// con esta opcion si que puedes extender otras clases puesto que lo que haces es implementar las interfaces

public class newThread implements Runnable {
	
	@Override
	public void run() {
			System.out.println("Run method starts for: " + Thread.currentThread().getName());
			if (Thread.currentThread().getName().equals("Thread 1")){
				try {
					Thread.sleep(10); // Let Thread 1 sleep for 10 milliseconds
				} catch (InterruptedException e) { // If somebody interrupts with in 10 mills, I will kill you
					e.printStackTrace();
				}
			}
			for (int i = 0; i <5; i++) {
			System.out.println("Run method of: " + Thread.currentThread().getName() + " iteration " + i);
			}
	}
		
}