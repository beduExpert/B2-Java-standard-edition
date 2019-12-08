package package1;

public class HerenciaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************** POLIMORFISMO ****************");
		
		//1. Ejecución del método declarado en la Superclase.
		Padre p = new Padre();
		p.baila(); // Baila chachacha  
		
		//2. Ejecución del método declarado en la Subclase.
		Hijo h = new Hijo();
		h.baila(); // Baila moderno, ejecución del método perteneciente a la instancia.
		
		//3. Ejecución del método declarado en la Subclase.
		Padre p1 = new Hijo(); //Referencia de tipo Superclase, instancia de tipo Subclase.
		p1.baila();            // Ejecución del método perteneciente a la instancia.
		
		//4. Modifica el método baila en clase Hijo, para que invoque el método baila de la clase Padre: super.baila()			
		//5. Coloca el modificador final sobre el método baila clase padre.
		//6. Trata de imprimir un objeto. Explica toString de Object, sobreescribe
		System.out.println(p1);
		
	}

}
