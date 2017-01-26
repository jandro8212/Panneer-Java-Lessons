package exerciseList;

import java.util.ArrayList;
import java.util.List;

public class exerciseGeneris {

	public static void main(String[] args) {
		
		List l = new ArrayList(); //ArrayList sin Generics
		l.add(10);
		l.add(45);
		l.add(1);
		l.add("Ten");
		l.add("Tasc");
		l.add("Tevadv");
		l.add("Tenadv");
		l.add(20.5);
		l.add(15);
		l.add(18);
		l.add("Tenjgf");
		l.add(25.45);
		
		for (Object listEntry: l){
			if (listEntry instanceof Integer){
				Integer intValue = (Integer) listEntry;
			System.out.println("It is integer: " + intValue);
			} 
		}
		
		for (Object listEntry: l){
			if (listEntry instanceof String){
				String stringValue = (String) listEntry;
				System.out.println("It is String: " + stringValue);
				}
		}
		
		for (Object listEntry: l){
			if (listEntry instanceof Double){
				Double doubleValue = (Double) listEntry;
				System.out.println("It is Double: " + doubleValue);
				}
		}
		
		//Bucle for para saber de que tipo son los Objetos que añado a la lista si no uso Generics
		/*for (Object listEntry: l){
			if (listEntry instanceof Integer){
				Integer intValue = (Integer) listEntry;
				System.out.println("It is Integer: " + intValue);
			} else if (listEntry instanceof String){
				String stringValue = (String) listEntry;
				System.out.println("It is String: " + stringValue);
			} else if (listEntry instanceof Double){
				Double doubleValue = (Double) listEntry;
				System.out.println("It is Double: " + doubleValue);
			}
		}
		
		List<Integer> intL = new ArrayList<Integer>(); //ArrayList con Generics
		intL.add(10);
		intL.add(45);
		intL.add(1);
		//intL.add("TEN"); me da error porque no es un int, es un string
		for (Integer listEntry: intL) {
			System.out.println("It is Integer: " + listEntry);
		}*/
		

	}

}
