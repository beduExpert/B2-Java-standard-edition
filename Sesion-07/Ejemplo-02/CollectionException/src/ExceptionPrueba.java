import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ExceptionPrueba {
	public static void main(String args[]){
		//1. Unchecked Exception
		//uncheckedException();
		
		//2. Checked Exception
		//checkedException();
		
		//3. MultiCatch
		//multiCatch();
		
		//4. autoClose
		//autoClose();
		
		//5. throws
		//avisoException(); //Explicar que es necesario un try/catch para manejarla o un throws sobre el main.
	}
	
	public static void avisoException() throws Exception {
		Path p = Paths.get("/home/soldadera/eclipse-workspace-bedu/CollectionException/archivo"); //Declararción de Path del archivo a leer.			
		Scanner s = new Scanner( new File(p.toString()) );	
	}
	
	public static void autoClose() {
		Path p = Paths.get("/home/soldadera/eclipse-workspace-bedu/CollectionException/archivo"); //Declararción de Path del archivo a leer.
		try( Scanner s = new Scanner(new File(p.toString())) ){
			while(s.hasNext()) {
				String lectura = s.nextLine();
				System.out.println(lectura);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Archivo no encontrado...");
		}
	}
	
	public static void multiCatch() {
		
		//Path p = Paths.get("/home/soldadera/eclipse-workspace-bedu/CollectionException/archivo"); //Declararción de Path del archivo a leer.
		/*try {
			BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND);
			writer.write("When you get older...");
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			System.out.println(e);
		}*/
		
		File f = new File("/home/soldadera/eclipse-workspace-bedu/CollectionException/archivo");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("I used to know");
			fw.close();
		}catch(FileSystemException e2) {
			System.out.println("FileSystemException");
		}catch( FileNotFoundException e ) {
			System.out.println("Archivo no encontrado...");
		}catch( IOException e1 ) {
			System.out.println("Algun error en escritura...");
		}
		
				
	}
	
	public static void checkedException() {
		Path p = Paths.get("/home/soldadera/eclipse-workspace-bedu/CollectionException/archivo"); //Declararción de Path del archivo a leer.			
		
		//2.1 Mostrar línea sin implmentar manejo exceptions.
		//Scanner s = new Scanner( new File(p.toString()) );
		
		//2.2 Mostrar manejo exception FileNotFoundException
		/*try {
			Scanner s = new Scanner( new File(p.toString()) );
		}catch(FileNotFoundException e) {
			System.out.println("Archivo no encontrado...");
		}*/
		
		//2.3 Lectura
		try {
			Scanner s = new Scanner( new File(p.toString()) );
			while( s.hasNextLine() ){
				String nombre = s.next();
				int edad = s.nextInt();
				String correo = s.next();
				System.out.println(nombre + " " + edad + " " + correo);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Archivo no encontrado...");
		}
			
	}
	
	public static void uncheckedException() {     
		String[] array= new String[3];
		array[0]="Linda";
		array[2]="Pato";
		
		//1.1 Impresión de contenido del arreglo, resaltar el null en la posición 1.
		/*for(String x :array) {
			System.out.println(x);
		}*/
		
		//1.2 Impresión del primer caracter de cada String encontrado en arreglo. Exception en la posición 1 - aplicación termina abruptamente.
		for(String x :array) {
			System.out.println(x.charAt(0)); 
		}
		
		//1.3 Manejo de exception NullPointerException
		/*for(String x :array) {
			try {
				System.out.println(x.charAt(0));
			}catch(NullPointerException e) {
				System.out.println("Encontrado un null, no es posible aplicar operación alguna...");
			}
		}*/
		
	}
		
}
