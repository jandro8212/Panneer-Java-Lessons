package Ex2;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		boolean result = isEven(10);
		System.out.println(result);
		
		//declare int variable
		int age = 26;
		//declare double
		double weight = 71.5;
		//declare float
		float size = 1.85f;
		//declare boolean
		boolean knowJava = false;
		//declare String
		String firstName, lastName;
		firstName = "Alejandro";
		lastName = "Lisarde";
		
		System.out.println(firstName + " " + lastName);
		//declare long
		long ageOfWorld = 999999999999999999l;
		
		
	//String equality checks
	String s1 = "SAP SE";
	String s2 = "SAP SE";
	String s3 = new String("SAP SE");
	String s4 = "SAP ";
	s4 = s4 + "SE";
	
	boolean b1 = (s1 == s2);
	boolean b2 = (s2 == s3);
	boolean b3 = (s2 == s4);
	boolean b4 = (s2.equals(s4));
	boolean b5 = ("SAP SE".equals(s1));
	boolean b6 = ("sap se".equals(s1));
	boolean b7 = ("sap se".equalsIgnoreCase(s1));
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
	System.out.println(b5);
	System.out.println(b6);
	System.out.println(b7);
	
	
	
	}

		public static boolean isEven(int number) {
		return number % 2 == 0;
	}

		public static void nameClass(String[] args) {
		
			String[] names = {"Alejandro", "Carlos", "Antonio", "Javi"};
			int[] newNumbers = {1, 2, 3};
			for (int i=0; i< names.length; i++){
				System.out.println(names[i]);
			}
		}
}

