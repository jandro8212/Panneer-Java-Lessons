package Student;

public class Students {
	String name;
	String lugar;
	String comida;
	
	public Students(String name, String lugar, String comida){
		this.name = name;
		this.lugar = lugar;
		this.comida = comida;	
	}
	

	//Behaviour
	public void queHace(){
		System.out.println("El alumno " + name + ", que es de " + lugar +" y no le gusta " + comida + " de Madrid, se esta durmiendo");
	}
	/*
	//Setters
	public void setName(String name){
		this.name = name;
	}
	public void setLugar(String lugar){
		this.lugar = lugar;
	}
	public void setComida(String comida){
		this.comida = comida;
	}
	
	//Getters
	public String getName(){
		return name;
	}
	public String getLugar(){
		return lugar;
	}
	public String getComida(){
		return comida;
	}
*/

}
