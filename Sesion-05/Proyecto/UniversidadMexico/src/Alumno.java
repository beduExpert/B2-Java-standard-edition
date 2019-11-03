import java.util.Scanner;

public class Alumno {
	 public String nombre;//Nombre
	 public int numeroCuenta;//NúmeroCuenta
	 public String correoElectronico;//CorreoElectrónico
	 public Libro []listaLibros = new Libro[3];
	 
	 public Alumno(String nombre, int numeroCuenta, String correElectronico) {		
		 this.nombre=nombre;
		 this.numeroCuenta=numeroCuenta;
		 this.correoElectronico=correoElectronico;
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
	public Libro[] getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(Libro[] listaLibros) {
		this.listaLibros = listaLibros;
	}
	 
	 
}
