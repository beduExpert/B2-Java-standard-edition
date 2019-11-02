import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Socio {
	private String nombre;            //nombre
	private int numeroSocio;          //numeroSocio
	private String correoElectronico; //correoElectronico
	private String telefono;          //telefono
	private int edad;				  //edad
	private final int maxActividades=3; 	  //máximo actividades
	private ArrayList<Actividad> actividades = new ArrayList<Actividad>();
	private static Path p = Paths.get("archivo.txt");
	
	
	public Socio(String nombre, int numeroSocio, String correoElectronico, String telefono, int edad) {
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
		this.correoElectronico=correoElectronico;
		this.telefono=telefono;
		this.edad=edad;
	}
	
	public String toString() {
		return getNombre() + " " + getNumeroSocio();
	}
	
	public ArrayList<Actividad> getActividades() {
		return actividades;
	}
		
	public void addActividad(Actividad nueva) {
		/*if(numActividad==maxActividades) {									
			System.out.println("No tienes derecho a más actividades...");
		}else{
			actividades[numActividad]=nueva;
			numActividad++;
			System.out.println("Actividad Agregada... " + nueva );
		}*/		
		if(actividades.size()==maxActividades) {
			System.out.println("No tienes derecho a más actividades...");
		}else {
			actividades.add(nueva);
			System.out.println("Actividad agregada... " + nueva);
		}
	}
	
	public static ArrayList<Socio> registroSocio(){
		/************************* Registro Socio ****************************/		
		System.out.println("************* Bienvenido al registro de socios: *************");
		ArrayList<Socio> socios = new ArrayList<Socio>();
		try {
			Scanner input = new Scanner(new File(p.toString()));
			while( input.hasNext() ) {
				String nombre = input.next();
				int numeroSocio = input.nextInt();
				String correoElectronico = input.next();
				String telefono=input.next();
				int edad = input.nextInt();
				if(edad < 18) {
					System.out.println("************************************************************");
					System.out.println("Problema - Solicitud rechazada...");
					System.out.println("Error, edad mínima para registrarse: 18");
					input.close();
				}
				Socio s = new Socio(nombre, numeroSocio, correoElectronico, telefono, edad);				
				System.out.println("Éxito al registrar socio número: " + s.getNumeroSocio());
				socios.add(s);
				System.out.println("************************************************************");			
			}
		}catch(FileNotFoundException f) {
			System.out.println("Archivo no encontrado...");
		}
		return socios;
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
