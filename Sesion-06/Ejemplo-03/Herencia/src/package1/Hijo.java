package package1;

public class Hijo extends Padre {
	
	public Hijo(){	
		System.out.println("Ejecutando constructor Subclase...");
	}
	
	public Hijo(String nombre) {
		super(nombre);
		System.out.println("Ejecutando constructor Subclase...");
	}	
	
	public void baila() {
		System.out.println("Baila mambo...");
	}
}
