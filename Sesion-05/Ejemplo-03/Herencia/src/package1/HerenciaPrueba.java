package package1;

public class HerenciaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************** HERENCIA ****************");
		Padre p = new Padre();
		p.baila();
		
		Hijo h = new Hijo();
		h.baila(); //1.- Explicación de objeto invocando un método "heredado" por desde la Superclase.
				   //2.- Cambia el modificador de acceso a private, después default(sin modificador), por último protected. 
	}

}
