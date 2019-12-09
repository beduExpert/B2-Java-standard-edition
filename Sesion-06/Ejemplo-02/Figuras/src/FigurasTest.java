
public class FigurasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo(); //Declarando instancia de tipo Círculo;
		Triangulo t = new Triangulo(); //Declarando instancia de tipo Triángulo;
		Cuadrado cu = new Cuadrado(); //Declarando instancia de tipo Cuadrado;
		
		calculadorAreas(c); //1. Invoca el método polimórfico, envíandole una instancia de tipo Círculo.
	}
	
	public static void calculadorAreas( Figura f ) {   	
		//f.calculaArea();
		//System.out.println("El radio del Círculo" + f.radio); //No es posible acceder a la característica radio. Necesario Casting y validación de tipo de instancia.
		
		//2. Explica instanceof y necesidad de casting.
		if( f instanceof Circulo ) {
			Circulo c = (Circulo)f;
			System.out.println("El radio es: " + c.radio);
		}else {
			if( f instanceof Triangulo ) {
				Triangulo t = (Triangulo)f;
				System.out.println("La base del Triángulo es: " + t.altura + " , Altura del Triángulo es: " + t.base);
			}else {
				if( f instanceof Cuadrado ) {
					Cuadrado c = (Cuadrado)f;
					System.out.println("El lado del Cuadrado es: " + c.lado);
				}
			}
		}
	}
}
