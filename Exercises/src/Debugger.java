
public class Debugger {
	
	public static void main(String[] args){
		System.out.println("Main 1");
		Debugger d = new Debugger();
		d.method1();
		System.out.println("Main 2");
	}
	
	public void method1(){
		System.out.println("Method 1a");
		method2();
		System.out.println("Method 1b");
		
	}
	public void method2(){
		System.out.println("Method 2a");
		System.out.println("Method 2b");
	}

}
