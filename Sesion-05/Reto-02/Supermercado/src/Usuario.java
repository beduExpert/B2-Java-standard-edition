import java.util.Scanner;

public class Usuario {
	private String usuario;         //id	
	private String nombre;          //nombre
	private String fechaCumpleaños; //fechaCumpleaños
	private String direccion;       //direccion
	private String telefono;        //telefono
	
	public static Usuario registroUsuario() {
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
		u1.setNombre(nombre);
		u1.setFechaCumpleaños(fechaCumpleaños);
		u1.setDireccion(direccion);
		u1.setTelefono(telefono);
		/***Calculando id***/
		int indice1 = u1.getNombre().indexOf(' ');
		u1.setUsuario(u1.getNombre().substring(0,indice1)+u1.getNombre().charAt(++indice1));
		
		System.out.println("Exito al registrar el usuario: " + u1.getUsuario());
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