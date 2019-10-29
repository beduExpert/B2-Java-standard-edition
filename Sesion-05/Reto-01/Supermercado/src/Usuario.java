
public class Usuario {
	private String usuario;         //id	
	private String nombre;          //nombre
	private String fechaCumpleaños; //fechaCumpleaños
	private String direccion;       //direccion
	private String telefono;        //telefono
	
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