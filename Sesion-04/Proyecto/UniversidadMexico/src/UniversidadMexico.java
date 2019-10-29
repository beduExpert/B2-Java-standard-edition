import java.util.*;

public class UniversidadMexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************************************************************************************************************");
		System.out.println("************************************ Desarrollador: Izumy Romero Yumbe *****************************************************");
		System.out.println("********************************************** Fecha: 15/10/19 *************************************************************");
		System.out.println("*********************************************** Versión: 1.0 ***************************************************************");
		System.out.println("****************************************************************************************************************************");
		System.out.println("************** BIENVENIDO A REGISTRO ALUMNO ***************");
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del Alumno a registrar: ");
		String nombre = s.nextLine();
		System.out.println("Introduce el número de cuenta: ");
		int numeroCuenta = s.nextInt();
		System.out.println("Introduce correo electrónico: ");
		String correoElectronico = s.next();
		s.close();
		
		/****CREANDO INSTANCIA****/
		Alumno a = new Alumno();
		a.nombre=nombre;
		a.numeroCuenta=numeroCuenta;
		a.correoElectronico=correoElectronico;
		System.out.println("Éxito al registrar alumno: " + a.nombre);
		System.out.println("************************************************************");

	}
}

