
public class EjemplosIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variableBoolean();
		//operadoresLogicos();
		operadorTernario();
	}

	public static void variableBoolean(){
		int edad=7;
		boolean mayoriaEdad = edad>=18;
		
		/*if(mayoriaEdad) {									//if evaluando la variable mayoriaEdad.
			System.out.println("Eres mayor de edad...");
		}*/
		
		if(mayoriaEdad) {									//if evaluando la variable mayoriaEdad.
			System.out.println("Eres mayor de edad...");
		}else {												//else ejecutado en caso de que condición de if sea false.
			System.out.println("Eres menor de edad...");
		}
	}		
	
	public static void operadoresLogicos() {
		int edad = 7;
		char clasificacionPelicula = 'A';
		
		if( edad>=18 && clasificacionPelicula=='A')						//Si el valor de la variable edad es mayor o igual a 18 AND el valor de la varialbe clasificacionPelicula es igual a A.
		{
			System.out.println("Bienvenido...");						//Se imprime Bienvenido...
		}else {															//De lo contrario
			if( edad>=18 && clasificacionPelicula=='B') {				//Si el valor de edad es mayor o igual a 18 AND el valor de clasificacion Pelicula es igual a B
				System.out.println("Bienvenido...");					//Se imprime Bienvenido...
			}else {														//De lo contrario
				System.out.println("No tienes permitido el acceso...");	//Se imprime No tienes permitido el acceso...
			}
		}
	}

	
	public static void operadorTernario() {
		/************ if code *************/
		String mensaje;												
		int edad=6;
		/*if( edad > 65 ) {											//Si edad es mayor a 65
			mensaje="Descuento";									//Se imprime Descuento
		}else {														//De lo contrario
			mensaje="Nulo Descuento";								//Se imprime Nulo descuento.
		}*/
		
		mensaje = (edad > 65) ? "Descuento" : "Nulo Descuento";		//Mismo ejemplo pero con operador ternario.
		System.out.println(mensaje);
	}
}
