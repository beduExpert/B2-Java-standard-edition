
public class Cuadrado extends Figura {
	public int lado=3;
	
	public Cuadrado() {
		System.out.println("Constructor Cuadrado");
	}
	
	public void calculaArea() {
		System.out.println("Calculando área Cuadrado: " + lado * lado );
	}
}
