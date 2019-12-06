import java.util.*;
public class GimnasioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/************************* Registro Socio ****************************/
		Scanner input = new Scanner(System.in);
		System.out.println("************* Bienvenido al registro de socios: *************");
		System.out.print("Ingresa el nombre del socio nuevo: ");
		String nombre = input.next();
		System.out.print("Ingresa el número de socio: ");
		int numeroSocio = input.nextInt();
		System.out.print("Ingresa el correo electrónico de socio: ");
		String correoElectronico = input.next();
		System.out.print("Ingresa el teléfono del socio: ");
		String telefono=input.next();	
		System.out.print("Ingresa tu edad: ");
		int edad = input.nextInt();
		if(edad < 18) {
			System.out.println("************************************************************");
			System.out.println("Problema - Solicitud rechazada...");
			System.out.println("Edad mínima para registrarse: 18");
			input.close();
			return;
		}
		input.close();
		
		Socio s1 = new Socio();
		s1.setNombre(nombre);
		s1.setNumeroSocio(numeroSocio);
		s1.setCorreoElectronico(correoElectronico);
		s1.setTelefono(telefono);
		
		System.out.println("Exito al registrar socio número: " + s1.getNumeroSocio() );
		System.out.println("*************************************************************");
		/*********************************************************************************/
		
	}
	
}
© 2019 GitHub, Inc.
