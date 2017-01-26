package inheritance;

public class App {

	public static void main(String[] args) {
		
		Metal M = new Metal("Rocha y Samuel", "el trombon", "Vaya mierda");
		M.fraseQueDice();
		
		Percusion N = new Percusion("Nardo", "los platillos", "Con toreria y gallardia, porque yo me gusta ser yo soy torero");
		N.fraseQueDice();
		
		Metal P = new Metal("La puta la Polda", "el yombardino", "OMOPLASTIKA!!!");
		P.fraseQueDice();
    
	}

}
