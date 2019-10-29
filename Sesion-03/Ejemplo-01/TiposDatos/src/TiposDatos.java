
public class TiposDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/********************* TIPOS DE DATOS ***********************/
		/*** 2. ***/
		declaracionTiposDatos();
		
		/*** 3. ***/
		//guionBajo();
	
		/*** 4. ***/
		//sumaShorts();
		//sumaDistintosTiposDatos();
		
		
		/************************* CASTING ***************************/
		//ejemploCasting();	
		
		/********************** TRUNCAMIENTO *************************/
		
		//ejemploTruncamiento();
		
		/**************** INCREMENTO & DECREMENTO ********************/

		//ejemploIncrementoDecremento();
		
		
		/**************** PRECEDENCIA OPERADORES ********************/
		//precedenciaOperadores();
		
	}
	
	public static void declaracionTiposDatos(){
		//Integrales: byte, short, int, long
				
		byte b = 8;   //8bits
	    short s = 16; //16bits
	    int i = 32;   //32bits			
		long l = 64;  //64 bits //Ojo, explicar PROMOCION, si no es colocada la l de long.

		//Decimal: double, float
		
		double d = 3.1416;  //64bits
		float f = 3.1416f;  //32bits //Ojo, explicar que pasa si no colocas la f d float.	
		
		//Caracteres
		
		char nuevoCaracter = 'c';
		
		//Boolean
		
		boolean z = true;
	}
	
	public static void guionBajo(){
		long total=999999999;
		long ss_num = 999_999_999;
		System.out.println(total);
		System.out.println(ss_num);
		System.out.println("------------------");	
	}
	
	public static void sumaShorts(){
		short x = 3;
		short y = 3;
		//short z = x + y; //Ojo, explicar sobre el tipo de dato que debe ser el resultado y la razón del error inicial.
	}
	
	public static void sumaDistintosTiposDatos(){
		int x = 32;
		short s = 16;
		byte b = 8;
		long l = 64;
		
		//resultado = x + s + b + l; //Preguntar: ¿La variable resultado debe ser declarada con que tipo de dato?
	}
	
	public static void ejemploCasting(){
		/*** Recordando: double ( 64 bits ) & float  ( 32 bits ) ***/		
		
		//float x = 3.1415; //Ojo, resolver este error con casting, indicar que el casting pude implicar truncamiento.
		
		System.out.println("****************************************");
		int number;	
		number = (int)(Math.random() * 10);                          //Ojo, se necesita generar un número aleatorio entero 0 al 9
		System.out.println("The random number is " + number + ".");
	}
		
	public static void ejemploTruncamiento() {

		int resultado1 = 10 / 2;
		System.out.println("División de dos enteros:" + resultado1 );
		
		int resultado2 = 10 / 3;
		System.out.println("División de dos enteros:" + resultado2 );
		
		double resultado3 = 10 / 3.0; // int-32 bits & double-64 bits
		System.out.println("División de dos enteros:" + resultado3 );
				
	}
	
	public static void ejemploIncrementoDecremento(){
		/****************INCREMENTO***********************/
		
		int x=10;
		int z=0;		
		z=x++;    //Ojo, explicar en pizarrón si es necesario.
		
		System.out.println("El valor de z es igual a: " + z);
		System.out.println("El valor de x es igual a: " + x);
		System.out.println("****************************");

		/*************** ++x & x++ ***********************/
		int y = 5;
		System.out.println("El valro de x es: " + y++);		//Ojo, expicar la razón del resultado en impresión.
		System.out.println("El valro de x es: " + ++y);
	}
	
	public static void precedenciaOperadores(){
		double x = 6, y = 12, resultado;
		resultado = 3.1416 * x * x * y * 1 / 3 ; //Ojo - Primero demostrar
		//resultado = 1 / 3 * 3.1416 * x * x * y ;   //Ojo - ¿Qué pasa si?, demostrar y explicar.
		//resultado = 1 / 3.0 * 3.1416 * x * x * y ;   //Ojo - ¿Qué pasa si?, demostrar y explicar.
		//resultado = 1 / (3.0 * 3.1416) * x * x * y ;   //Ojo - ¿Qué pasa si?, demostrar y explicar.
		System.out.println("Resultado " + resultado + ".");
	}
	
}
