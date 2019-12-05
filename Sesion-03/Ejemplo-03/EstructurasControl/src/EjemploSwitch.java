
public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/************* Recordar CalculadorIf ******************/
		//calculadoraIf();
		//calculadoraSwitch();
		//switchCascada();
	}

	public static void switchCascada() {
		int dia = 1;
		switch( dia ) {
			case 1: System.out.println("Lunes");	 //Sin breaks, la ejecución continua hasta encontrar un break o termine la sentencia switch.
			case 2: System.out.println("Martes");			
			case 3: System.out.println("Miércoles");			
			case 4: System.out.println("Jueves");			
			case 5: System.out.println("Viernes");						
			case 6: System.out.println("Sábado");
			case 7: System.out.println("Domingo");
		}
	}
	
	public static void calculadoraSwitch() {	
		int input = 0, answer = 0;
		int num1 = 5;
		int num2 = 2;	
		char operador = '+';							//Variable de tipo char, llamada operador, contendrá el valor que será comparado contra los case's.
		switch (operador){								//Apertura de la esctrucutra switch, trabajará con el valor de la variable operador.
			case '*' :									//En el caso de que operador tenga el valor *
				answer = num1 * num2;					//A la variable answer se le asigna el resultado de multiplicar, num1 * num2
				break;									//break, salgo del switch.
			case '/' :									//En el caso de que operador tenga el valor /
				answer = num1 / num2;   				//A la variable answer se le asigna el resultado de dividir. num1 / num2
				break;									//break, salgo del switch.
			case '%' :									//En el caso de que operador tenga el valor %
				answer = num1 % num2;   				//A la variable answer se le asigna el residuo de dividir. num1 / num2
				break;									//break, salgo del switch.
			case '+' :									//En el caso de que operador tenga el valor +
				answer = num1 + num2;					//A la variable answer se le asigna el residuo de sumar. num1 + num2
				break;									//break, salgo del switch.
			case '-' :									//En el caso de que operador tenga el valor -
				answer = num1 - num2;					//A la variable answer se le asigna el residuo de sumar. num1 - num2
				break;									//break, salgo del switch.
			default:									//En el caso de que operador no tenga ningún valor que haga match con algún case.
				System.out.println("Invalid Command.");	//Se ejecutará esta línea.
		}
		System.out.println("El resultado es: " + answer);
	}
	
	public static void calculadoraIf() {	
		int num1 = 5;
		int num2 = 2;	
		char operador = '*';
		if( operador == '*' )
			System.out.println(num1 * num2);
		else if( operador == '/' )
			System.out.println(num1 / num2);
		else if( operador == '%' )
			System.out.println(num1 % num2);
		else if( operador == '+' )
			System.out.println(num1 + num2);
		else if( operador == '-' )
			System.out.println(num1 - num2);	
	}
}
