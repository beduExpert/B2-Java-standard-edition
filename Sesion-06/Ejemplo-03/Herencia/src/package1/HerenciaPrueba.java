package package1;

public class HerenciaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************** CONSTRUCTOR ****************");
		
		//1.- Creación de una instancia de tipo Hijo, utilizando el constructor que no recibe argumentos.
		//La impresión corresponde a la ejecución del constructor de la Superclase y después de la Subclase.
		Hijo h = new Hijo(); 
		h.baila();
		
		//2.- Creación de una instancia de tipo Hijo, utilizando el constructor que recibe un String como argumento.
		//La impresión corresponde a la ejecución del constructor de la Superclase y después de la Subclase.
		Hijo h2 = new Hijo("Patricio");
		h2.baila();
		
	}

}
