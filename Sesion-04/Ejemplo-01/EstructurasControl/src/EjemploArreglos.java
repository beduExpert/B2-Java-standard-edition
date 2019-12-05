
public class EjemploArreglos {
	public static void main(String args[]) {
		//arregloPrimitivos();
		//arregloObjetos();
		arregloBidimensional(); //EjemploOpcional
	}
	
	public static void arregloBidimensional() {
		int x[][];
		x = new int[3][];
		
		x[0]=new int[2];
		x[1]=new int[3];
		x[2]=new int[4];
		
		x[0][0]=0;
		x[0][1]=1;
		x[1][0]=2;
		x[1][1]=3;
		x[1][2]=4;
		x[2][0]=5;
		x[2][1]=6;
		x[2][2]=7;
		x[2][3]=8;
		
		for(int y[]:x){
			for(int temp:y){
				System.out.print(temp + ",");
			}
			System.out.println();
		}
	}
	
	public static void arregloObjetos() {
		String[] dias = {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"}; //Declarando arreglo de tipo String, 7 elementos.
		
		/*for(int index = 0; index < dias.length; index++){								      //Recorriendo arreglo con for tradicional, para imprimir cada una de sus posiciones.
			System.out.println(dias[index]);
		}*/
		
		for(String x : dias) {	
			System.out.println(x);															  //Recorriendo arreglo con for-each, para imprimir cada una de sus posiciones.
		}	
	}
	
	public static void arregloPrimitivos() {
		int x[] = {1, 2, 3, 4, 5};			//Declarando arreglo de tipo int, 5 elementos.
		
		/*for( int i=0; i<x.length ; i++ ){	//Recorriendo arreglo con for tradicional, para imprimir cada una de sus posiciones.
			System.out.println(x[i]);
		}*/
		
		for( int temp : x){					//Recorriendo arreglo con for-each, para imprimir cada una de sus posiciones.
			System.out.println(temp);
		}
	}
}
