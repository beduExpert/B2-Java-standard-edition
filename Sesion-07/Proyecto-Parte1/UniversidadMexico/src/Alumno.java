import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	 private String nombre;//Nombre
	 private int numeroCuenta;//NúmeroCuenta
	 private String correoElectronico;//CorreoElectrónico
	 private final int MAX_LIBROS = 3;
     private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	 
	 public Alumno(String nombre, int numeroCuenta, String correElectronico) {		
		 this.nombre=nombre;
		 this.numeroCuenta=numeroCuenta;
		 this.correoElectronico=correElectronico;
	 }
	 
	 public void addLibro(Libro nuevo) {
		 if( listaLibros.size() == MAX_LIBROS) {
			 System.out.println("No puedes solicitar más libros...");
		 }else {
			 listaLibros.add(nuevo);
			 System.out.println("Libro agregado...");
		 }		 
	 }
	 
	 public static Alumno registraAlumno() {		
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
			Alumno a = new Alumno(nombre, numeroCuenta, correoElectronico);			
			System.out.println("Éxito al registrar alumno: " + a.nombre);
			System.out.println("************************************************************");
			return a;
	 }
	 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(ArrayList listaLibros) {
		this.listaLibros = listaLibros;
	}
	 
	 
}
