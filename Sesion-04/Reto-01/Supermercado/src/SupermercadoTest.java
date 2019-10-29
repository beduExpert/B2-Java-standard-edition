import java.util.*;

public class SupermercadoTest {
	public static void main(String args[]) {
		/************************* Registro Usuario ****************************/
		Scanner input = new Scanner(System.in);
		System.out.println("************* Bienvenido al registro de usaurios: *************");
		System.out.print("Ingresa el nombre del usuario: ");
		String nombre = input.nextLine();
		System.out.print("Ingresa fecha cumpleaños del usuario: ");
		String fechaCumpleaños=input.nextLine();		
		System.out.print("Ingresa la dirección del usuario nuevo: ");		
		String direccion = input.nextLine();		
		System.out.print("Ingresa el teléfono del usuario nuevo: ");
		String telefono = input.nextLine();		
		input.close();
		
		Usuario u1 = new Usuario();
		u1.nombre=nombre;
		u1.fechaCumpleaños=fechaCumpleaños;
		u1.direccion=direccion;
		u1.telefono=telefono;
		/***Calculando id***/
		int indice1 = u1.nombre.indexOf(' ');
		u1.usuario = u1.nombre.substring(0,indice1)+u1.nombre.charAt(++indice1);
		
		System.out.println("Exito al registrar el usuario: " + u1.usuario);
		System.out.println("*************************************************************");
		/*********************************************************************************/
	}
}
