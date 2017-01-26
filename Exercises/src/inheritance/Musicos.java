package inheritance;


public abstract class Musicos {
	
 static String instrumento;
 static String banda = " en la UMY";
 static String nombre;
 static String dice;
 
 public static int musicos = 0;
 
 public Musicos() {
		this.nombre = "Leo";
		this.instrumento = "platillos";
		this.dice = "holaaa";
		musicos++;
	}
	
	public Musicos(String nombre, String instrumento, String dice ) {
		this.nombre = nombre;
		this.instrumento = instrumento;
		this.dice = dice;
		musicos++;
	}
	
	public abstract void fraseQueDice();
}
