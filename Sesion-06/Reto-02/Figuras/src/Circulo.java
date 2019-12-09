
public class Circulo extends Figura {
	public float radio=4.5f;
	
	public Circulo() {
		System.out.println("Constructor Círculo...");
	}
	
	public void calculaArea() {
		System.out.println("Calculando área Circulo: " + Math.PI * Math.pow(radio, 2) );
	}
}
