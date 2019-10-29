
public class EjemploStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/********************* LONGITUD ***********************/
		
		//longitud();
		
		/******************** CONCATENACIÓN ********************/
		
		//concatenacion();
		
		/******************** CONCATENACIÓN ********************/
		
		iguales();
		
		/************** Ejemplo Generación Usuario *************/
		
		//generacionUsuario();
	}

	public static void longitud(){
		String x = "HOLA";		
		System.out.println("Longitud del string x: " + x.length() );
	}
	
	public static void concatenacion(){
		String x = "HOLA";
		
		x = x + " MUNDO";
		System.out.println(x);
		
		x = x.concat(" CRUEL"); 
		System.out.println(x);
	}
	
	public static void iguales() {
		String x = "HOLA";
		String y = new String("HOLA");
		System.out.println("x & y, ¿son iguales? " + x.equals(y));
	}
	
	public static void generacionUsuario() {
		String nombre = "Izumy Romero Yumbe";
		char primerCaracterNombre = nombre.charAt(0);
		int indicePaterno = nombre.indexOf(' ');
		System.out.println(indicePaterno);
		int indiceMaterno = nombre.indexOf(' ',++indicePaterno);
		System.out.println(indiceMaterno);
		String usuario = primerCaracterNombre+nombre.substring(indicePaterno,indiceMaterno);
		
		System.out.println(usuario);
	}
}
