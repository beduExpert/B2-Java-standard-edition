
public class Triangulo extends Figura {
	public int altura=5;
	public int base=8;
	
	public Triangulo() {
		System.out.println("Constructor Triángulo...");
	}
	
	public void calculaArea() {
		System.out.println("Calculando área Triángulo: " + (base*altura)/2 );
	}
}
