package inheritance;

public class Metal extends Musicos{
	public Metal(String nombre, String instrumento, String dice ) {
		super(nombre, instrumento, dice);
	}
public void fraseQueDice() {
		System.out.println(Musicos.nombre + " que toca " + Musicos.instrumento +" que es de metal"+ Musicos.banda + ", dice:");
		System.out.println(Musicos.dice);
	}
}