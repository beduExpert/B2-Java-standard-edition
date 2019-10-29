
public class UniversidadMexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************************************************************************************************************");
		System.out.println("************************************ Desarrollador: Izumy Romero Yumbe *****************************************************");
		System.out.println("********************************************** Fecha: 15/10/19 *************************************************************");
		System.out.println("*********************************************** Versión: 1.0 ***************************************************************");
		System.out.println("****************************************************************************************************************************");
		//Libro l = new Libro();
		Alumno a1 = new Alumno();
		a1.numeroCuenta=990873;
		a1.nombre="Patricia";
		a1.correoElectronico="p_mone@gmail.com";
		
		System.out.println("Imprimiendo alumno: " + a1.numeroCuenta);
		System.out.println("Nombre: " + a1.nombre);
		System.out.println("Correo Electronico: " + a1.correoElectronico);
		System.out.println("********************************************");
		Alumno a2 = new Alumno();
		a2.numeroCuenta=43223;
		a2.nombre="Alejandra";
		a2.correoElectronico="alita@gmail.com";
		
		System.out.println("Imprimiendo alumno: " + a2.numeroCuenta);
		System.out.println("Nombre: " + a2.nombre);
		System.out.println("Correo Electronico: " + a2.correoElectronico);
	}
}

