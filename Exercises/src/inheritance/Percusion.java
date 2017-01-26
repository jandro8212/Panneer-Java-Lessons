package inheritance;

public class Percusion extends Musicos{
	public Percusion(String nombre, String instrumento, String dice ) {
		super(nombre, instrumento, dice);
	}
public void fraseQueDice() {
	System.out.println(Musicos.nombre + " que toca " + Musicos.instrumento +" que es de percusion"+ Musicos.banda + ", dice:");
	System.out.println(Musicos.dice);	
	}
}