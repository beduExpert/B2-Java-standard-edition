import java.util.*;

import org.universidad_mexico.estudiantes.Alumno;
import org.universidad_mexico.libros.FilosofiaLibro;
import org.universidad_mexico.libros.FisicaLibro;
import org.universidad_mexico.libros.Libro;
import org.universidad_mexico.libros.PoliticaLibro;

public class UniversidadMexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************************************************************************************************************");
		System.out.println("************************************ Desarrollador: Izumy Romero Yumbe *****************************************************");
		System.out.println("********************************************** Fecha: 15/10/19 *************************************************************");
		System.out.println("*********************************************** Versión: 1.0 ***************************************************************");
		System.out.println("****************************************************************************************************************************");
		
		ArrayList<Alumno> lista = Alumno.registraAlumno(); 

		System.out.println("Prestando libros a alumno...");
		Alumno a1 = lista.get(0);
		a1.addLibro(new FilosofiaLibro());
		a1.addLibro(new PoliticaLibro());
		
		System.out.println("¿Cuándo debo regresar libros?");
		sistemaRetornaLibros(a1.getListaLibros());
	}
	
	public static void sistemaRetornaLibros( ArrayList<Libro> libros) {
		for( Libro l : libros) {
			if( l instanceof FilosofiaLibro ) {
				l.tiempoRetorno();
			}else {
				if( l instanceof FisicaLibro ) {
					l.tiempoRetorno();
				}else {
					if( l instanceof PoliticaLibro ) {
						l.tiempoRetorno();
					}
				}
				
			}
		}
	}
}

