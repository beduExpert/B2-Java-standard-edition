
public class Actividad {
	public String nombre;//nombre
	public int id; //id
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void ejecutarActividad() {
		System.out.println("General...");
	}
	
}
