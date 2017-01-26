package threadDemo;

public class Account {
	int balance;
	int oldBalance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	//poniendo "synchronized" en el metodo lo que haces es que entran los Thread de uno en uno en el 
	//metodo y no salen hasta que acaban de hacerlo, de normal van entrando y saliendo aleatoriamente
	//esto no esta  aconsejado para metodos con mucho codigo, mejor poner a mitad una linea de
	// synchronized(this) {} en el bloque del metodo que quieres que se haga de uno en uno
	
	public synchronized void depositOrWithDraw(int amount) {
		oldBalance = balance;
		System.out.println("Current Balance: " + balance);
		int newBalance = oldBalance + amount;
		balance = newBalance;
		
	}
	
	public int getBalance() {
		return balance;
	}

}