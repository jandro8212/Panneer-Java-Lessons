package inheritance;

public class Madera extends Musicos {
	public Madera(String nombre, String instrumento, String dice ) {
		super(nombre, instrumento, dice);
	}
	public void fraseQueDice() {
		System.out.println(Musicos.nombre + " que toca " + Musicos.instrumento +" que es de madera "+ Musicos.banda + ", dice:");
		System.out.println(Musicos.dice);
	}
}