package package1;

public class Padre {
	
	public String nombre;
	
	public Padre(){	
		System.out.println("Ejecutando constructor Superclase...");
	}
	
	public Padre(String nombre) {
		this.nombre=nombre;
		System.out.println("Ejecutando constructor Superclase...");
	}
	
	public void baila() {
		System.out.println("Baila chachacha");
	}
}
