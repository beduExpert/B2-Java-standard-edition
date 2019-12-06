import java.util.Scanner;

public class Socio {
	private String nombre;            //nombre
	private int numeroSocio;          //numeroSocio
	private String correoElectronico; //correoElectronico
	private String telefono;          //telefono
	private int edad;				  //edad
	
	public static Socio registroSocio(){
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
			return null;
		}
		input.close();
		
		Socio s1 = new Socio();
		s1.setNombre(nombre);
		s1.setNumeroSocio(numeroSocio);
		s1.setCorreoElectronico(correoElectronico);
		s1.setTelefono(telefono);
		
		System.out.println("Exito al registrar socio número: " + s1.getNumeroSocio() );
		return s1;
		/*********************************************************************************/
	}
	 
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getNumeroSocio(){
		return numeroSocio;
	}
	
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio=numeroSocio;
	}
	
	public String getCorreoElectronico(){
		return correoElectronico;
	}
	
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico=correoElectronico;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
}