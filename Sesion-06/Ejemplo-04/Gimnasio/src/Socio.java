import java.util.Scanner;

public class Socio {
	private String nombre;            //nombre
	private int numeroSocio;          //numeroSocio
	private String correoElectronico; //correoElectronico
	private String telefono;          //telefono
	private int edad;				  //edad
	private final int maxActividades=3; 	  //máximo actividades
	private int numActividad=0;		  //índice de inserción
	private Actividad[] actividades=new Actividad[maxActividades];
	
	
	public Socio(String nombre, int numeroSocio, String correoElectronico, String telefono, int edad) {
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
		this.correoElectronico=correoElectronico;
		this.telefono=telefono;
		this.edad=edad;
	}
	
	public Actividad[] getActividades() {
		return actividades;
	}
	
	public void addActividad(Actividad nueva) {
		if(numActividad==maxActividades) {									
			System.out.println("No tienes derecho a más actividades...");
		}else{
			actividades[numActividad]=nueva;
			numActividad++;
			System.out.println("Actividad Agregada... " + nueva );
		}
	}
	
	public static Socio registroSocio(){
		/************************* Registro Socio ****************************/		
		System.out.println("************* Bienvenido al registro de socios: *************");
		Scanner input = new Scanner(System.in);
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
			System.out.println("Error, edad mínima para registrarse: 18");
			input.close();
			//return;	
			return null; //Cambio debido al tipo de retorno del método.
		}
		input.close();
		
		Socio s1 = new Socio(nombre, numeroSocio, correoElectronico, telefono, edad);				
		System.out.println("Éxito al registrar socio número: " + s1.getNumeroSocio());
		System.out.println("************************************************************");
		
		return s1;			
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
