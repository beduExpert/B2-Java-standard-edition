
public class SupermercadoTest {
	public static void main(String args[]) {
		//Pedido p = new Pedido();//Declarando instancia de tipo Pedido.
		//Producto pr = new Producto(); //Declarando instancia de tipo Producto
		Usuario s = new Usuario(); //Declarando instancia de tipo Supermercado.
		s.id=3;
		s.nombre="Nochipa";
		s.fechaCumpleaños="05/09/2014";
		s.direccion="Privada de Tejocotes, #3";
		s.telefono="333-22-11";
		
		System.out.println("Usuario número: " + s.id);
		System.out.println("Nombre: " + s.nombre);
		System.out.println("Fecha Cumpleaños: " + s.fechaCumpleaños);
		System.out.println("Dirección: " + s.direccion);
		System.out.println("Telefono: " + s.telefono);
	}
}
