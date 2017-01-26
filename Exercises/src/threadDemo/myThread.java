package threadDemo;

// con este metodo no puedes extender ninguna otra clase

public class myThread extends Thread{
	Account acc;
	int amount;
	
	public myThread(String threadName, Account a, int amount) {
		super(threadName);
		this.acc = a;
		this.amount = amount;
	}
	@Override
	public void run() { 
		//otra forma de hacer que se sincronice, para el bloque entero
		synchronized(acc){
		acc.depositOrWithDraw(amount);
		}
		/*System.out.println("Run method starts for: " + getName());
		if (getName().equals("Thread 1")){
			try {
				Thread.sleep(10); // Let Thread 1 sleep for 10 milliseconds
			} catch (InterruptedException e) { // If somebody interrupts with in 10 mills, I will kill you
				e.printStackTrace();
			}
		}
		for (int i = 0; i <5; i++) {
		System.out.println("Run method of: " + getName() + " iteration " + i);
		}*/
	}
}