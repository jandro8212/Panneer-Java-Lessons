package Exercise4;

public class RobotApp {

	public enum Gender {
		MALE, FEMALE
	}
	public static void main(String[] args) {
		
		robot r1 = new robot("Alejandro", 26, Gender.MALE);
		r1.saySomething();
		
		robot r2 = new robot("Eva", 1, Gender.FEMALE);
		r2.saySomething();
		
		robot r3 = new robot("Guillermo", 3, Gender.MALE);
		r3.saySomething();
		
		robot r4 = new robot("Isabel", 17, Gender.FEMALE);
		r4.saySomething();
		
		robot r5 = new robot("Cristina", 36, Gender.FEMALE);
		r5.saySomething();
		
		robot r6 = new robot("Pepe", 0, Gender.MALE);
		r6.saySomething();
		
		noRobots();
		
	}
	public static void noRobots(){
		int number = robot.robotsCreated;
		System.out.println("Numero de robots creados: " + number);
	}
}
