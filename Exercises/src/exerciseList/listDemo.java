package exerciseList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("Alejandro");
		l.add("Carlos");
		l.add("Javi");
		l.add("Marcos");
		l.add("Alejandro");
		
		System.out.println("Initial Size: " + l.size());
		
		/*for (int i = 0; i<l.size(); i++) {
			System.out.println((i+1) + ".-" + l.get(i));
		}
		
		//Buscar si hay algun valor en la lista
		boolean result = l.contains("Carlos");
		System.out.println(result);
		*/
		//Quitar valores de la lista
		/*l.remove("Alejandro");
		System.out.println("New Size: " + l.size());
		
		for (int i = 0; i<l.size(); i++) {
			System.out.println((i+1) + ".-" + l.get(i));
		}
		
		//Borrar todos los elementos
		l.clear();
		System.out.println("New Size: " + l.size());
		 */
		//Mirar si la lista esta vacia
		/*
		System.out.println("¿Esta vacia la lista? " + l.isEmpty());
		 */
		
		//Use Iterator
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
