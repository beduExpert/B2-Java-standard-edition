import java.util.*;

import org.universidad_mexico.estudiantes.Alumno;

public class UniversidadMexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************************************************************************************************************");
		System.out.println("************************************ Desarrollador: Izumy Romero Yumbe *****************************************************");
		System.out.println("********************************************** Fecha: 15/10/19 *************************************************************");
		System.out.println("*********************************************** Versión: 1.0 ***************************************************************");
		System.out.println("****************************************************************************************************************************");
		
		ArrayList<Alumno> lista = Alumno.registraAlumno(); 
		
		System.out.println(lista);
		
	}
}

