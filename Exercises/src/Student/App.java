package Student;

public class App {

	public static void main(String[] args) {
		
		Students s1 = new Students("Alejandro", "Yatova", "la paella");
		/*s1.setName("Alejandro");
		s1.setLugar("Yatova");
		s1.setComida("la paella");*/
		s1.queHace();
		
		Students s2 = new Students("Carlos", "Gran Canaria", "el mojo picón");
		/*s2.setName("Carlos");
		s2.setLugar("Gran Canaria");
		s2.setComida("el mojo picón");*/
		s2.queHace();
		
		Students s3 = new Students("Juan Carlos", "Cordoba", "el salmorejo");
		/*s3.setName("Juan Carlos");
		s3.setLugar("Cordoba");
		s3.setComida("el salmorejo");*/
		s3.queHace();
	
	}

}
