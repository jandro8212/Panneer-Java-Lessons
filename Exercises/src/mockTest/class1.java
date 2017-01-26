package mockTest;

public abstract class class1 implements Interface1, Interface2, Interface3 {

	@Override
	public void method3() {
		System.out.println("Esto es el tercer metodo");
	}

	@Override
	public void method2() {
		System.out.println("Esto es el segundo metodo de " + name);
	}

	@Override
	public abstract void method1();
		

}
