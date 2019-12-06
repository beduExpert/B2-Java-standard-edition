import java.util.Scanner;

public class Usuario {
	public String usuario;         //id
	public String nombre;          //nombre
	public String fechaCumpleaños; //fechaCumpleaños
	public String direccion;       //direccion
	public String telefono;        //telefono
	
	public Usuario(String nombre, String fechaCumpleaños, String direccion, String telefono) {
	 	this.nombre=nombre;
	 	this.fechaCumpleaños=fechaCumpleaños;
	 	this.direccion=direccion;
	 	this.telefono=telefono;
	 }
	
	public Usuario() {
		 
	 }
	
	public static Usuario registraUsuario() {
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
		
		Usuario u1 = new Usuario(nombre, fechaCumpleaños, direccion, telefono);
		/***Calculando id***/
		int indice1 = u1.getNombre().indexOf(' ');
		u1.setUsuario(u1.getNombre().substring(0,indice1)+u1.getNombre().charAt(++indice1));
		
		System.out.println("Exito al registrar el usuario: " + u1.usuario);
		System.out.println("*************************************************************");
		return u1;
		/*********************************************************************************/	
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFechaCumpleaños() {
		return fechaCumpleaños;
	}
	
	public void setFechaCumpleaños(String fechaCumpleaños) {
		this.fechaCumpleaños = fechaCumpleaños;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//levantaPedido
}
