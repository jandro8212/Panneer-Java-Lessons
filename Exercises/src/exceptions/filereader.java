package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) {
		try {
			read();
		} catch (IOException e) {
			System.out.println("at last I am handling the exception...");
		}
	}
	
	public static void read() throws IOException {
		try {
			readFile();
		} catch (IOException e) {
			throw e;
		}
	}
		 
	public static String readFile() throws IOException{
		/*
		 Primera Opcion!!
		
		
		File file = new File("C://Users//Arranque 1//Desktop//Java//file.txt"); // Create a File Object with file name
		//Al copiar y pegar el camino del archivo hay que cambiar las "\" que salen predefinidas por "//"
		try{
		FileReader reader = new FileReader (file); //Create a reader for the file
		
		char[] content = new char[1000]; // Declare a char array
		reader.read(content);// Read the content from the file
		
		String s = new String(content);
			System.out.println(s);
			
			return s;
		
		//Print the content
		for (int i = 0; i < content.length; i++) {
			System.out.print(content[i]);
		}
		
		reader.close(); //Close the reader
			
		} catch(FileNotFoundException e) {
			System.out.println(e.toString());
			
		} catch(IOException e2) {
			System.out.println(e2.toString());
			
		} finally {
			
		}
		*/
		
		// Segunda Opcion!!
		
		
		FileReader reader = null;
		
		//try{
			File file = new File("C://Users//Arranque 1//Desktop//Java//file.txt"); // Create a File Object with file name
			//Al copiar y pegar el camino del archivo hay que cambiar las "\" que salen predefinidas por "//"
			reader = new FileReader (file); //Create a reader for the file
		
			char[] content = new char[1000]; // Declare a char array
			reader.read(content);// Read the content from the file
			
			String s = new String(content);
			System.out.println(s);
			
			return s.trim(); // el .trim() es para borrar todos los espacios que se crean con el char 
		/*
			//Print the content
			for (int i = 0; i < content.length; i++) {
				System.out.print(content[i]);
			}*/
			
			//reader.close();
			
			/*} catch(FileNotFoundException e) {
				System.out.println(e.toString());
			
			} catch(IOException e2) {
				System.out.println(e2.toString());
			
			} finally {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			}
		*/
	}	
}

