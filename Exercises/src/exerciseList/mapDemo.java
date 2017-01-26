package exerciseList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		//Create a Map
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Alejandro");
		m.put(2, "Carlos");
		m.put(3, "Marcos");
		m.put(4, "Javi");
		m.put(5, "Alejandro");
		
		System.out.println("Initial Size: " + m.size());
		Set Keys = m.keySet();
		Iterator itr = Keys.iterator();
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.print("Keys: " + key + " ");
			System.out.println("Name: " + m.get(key));
		}
	}

}
