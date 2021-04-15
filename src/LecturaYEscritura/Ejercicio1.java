package LecturaYEscritura;
import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		
		String Fichero ="C:/Users/Angel/Desktop/Eclipse/Trismentre3/src/LecturaYEscritura/prueba.txt";

		FileReader fr = null;
		try {
			fr = new FileReader(Fichero);
			int a = fr.read();
			int v = 0;
			
			while(a != -1) {
				System.out.println((char)a);
				a = fr.read();
				
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Error");
		}
	}

}
