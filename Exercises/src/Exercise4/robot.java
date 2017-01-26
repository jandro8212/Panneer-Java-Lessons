package Exercise4;

public class robot {
	
	RobotApp.Gender gender;
	String name;
	int age;
	public static int robotsCreated = 0;
	
	public robot(String name, int age, RobotApp.Gender gender){
		this.name = name;
		this.age = age;
		this.gender = gender;	
		robotsCreated++;
	}
	
	//Behaviour
	public void saySomething(){
		if (age < 2){
		System.out.println("Yo " + name + " tengo " + age + " años");
		}
		else if(age < 6){
		System.out.println("Yo soy " + name + " y tengo " + age + " años");
		}
		else if(age < 18){
		System.out.println("Buenos dias, soy " + name + " y tengo " + age + " años");
		}
		else {
		System.out.println("Buenos dias, mi nombre es " + name + " y tengo " + age + " años");
		}
	}
	
}
