import java.util.*;

public class UniversidadMexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************************************************************************************************************");
		System.out.println("************************************ Desarrollador: Izumy Romero Yumbe *****************************************************");
		System.out.println("********************************************** Fecha: 15/10/19 *************************************************************");
		System.out.println("*********************************************** Versión: 1.0 ***************************************************************");
		System.out.println("****************************************************************************************************************************");
		
		Alumno a = Alumno.registraAlumno();
		
		a.addLibro(new FisicaLibro());
		a.addLibro(new FilosofiaLibro());
		a.addLibro(new PoliticaLibro());
		System.out.println("************************************************************");

		System.out.println("El alumno: " + a.getNumeroCuenta() + ", quiere obtener un libro más, ¿se puede?");
		a.addLibro(new FilosofiaLibro());
		System.out.println("************************************************************");

		System.out.println("¿En cuánto tiempo tiene que retornar los libros el alumno: " + a.getNumeroCuenta() + "?");
		for( Libro x : a.getListaLibros()) {
			x.tiempoRetorno();
		}
		
	}
}

