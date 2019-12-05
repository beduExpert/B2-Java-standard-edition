import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);				          //Declarando objeto de tipo Scanner, leera desde el teclado --> System.in
		System.out.println("Introduce tu nombre: ");			  //Solicitando nombre al usuario.
		String nombre = s.next();							      //Leyendo un String con el método next().
		System.out.println("Introduce tu edad: ");				  //Solicitando edad al usuario.
		int edad = s.nextInt();									  //Leyendo un int con el método nextInt().
		System.out.println("Introduce tu dirección: ");			  //Solicitando dirección al usuario.
		String direccion = s.next();							  //Leyendo un String con el método next().
		s.close();												  //Cerrando el Scanner.
		
		System.out.println("**********************************");
		System.out.println("Imprimiendo los datos ingresados: ");   // Imprimiendo los valores leídos desde el teclado
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Dirección: " + direccion);
	}
}
