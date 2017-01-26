package interexercise;

public class datosPersonales implements Datos {
	String name;
	String lastname;
	int age;
	
	public void printDatos(){
		System.out.println("Nombre:" + name);
		System.out.println("Apellidos: " + lastname);
		System.out.println("Edad: " + age);
	}

	@Override
	public void name(String name) {
		System.out.println("Nombre:");

	}

	@Override
	public void lastname(String lastname) {
		System.out.println("Apellidos: ");

	}

	@Override
	public void age(int age) {
		System.out.println("Edad: ");

	}

}
