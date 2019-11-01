import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPrueba {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//1.- Arreglo
		/************************ Arreglo ********************/

		/*int[] array1 = new int[3];
		array1[0]=13;
		array1[1]=30;
		array1[2]=5;

		array1 = new int[6];		
		
		for( int temp : array1) {
			System.out.println(temp);
		}*/

		//2.- ArrayList
		/************************ ArrayList de nombres ********************/
	    ArrayList<Integer> groupNumbers = new ArrayList<Integer>();
	    groupNumbers.add(13);
	    groupNumbers.add(30);
	    groupNumbers.add(5);
	    groupNumbers.add(19);
		
		System.out.println("Imprimiendo ArrayList: " + groupNumbers);
	    System.out.println("Tamaño ArrayList: " + groupNumbers.size());		
		System.out.println("Obteniendo objeto en la posición 1 del ArrayList: " + groupNumbers.get(1));		
		System.out.println("Eliminando Objeto en la posición 2 del ArrayList: " + groupNumbers.remove(2)); 
		System.out.println("Imprimiendo ArrayList: " + groupNumbers);	
		
		//3. Valor repetido
		/*********************** Valor repetido en ArrayList ***************/
		
		groupNumbers.add(13);
		System.out.println("Imprimiendo con valor repetido: " + groupNumbers);
		
		//4. for-each
		/*********************** Valor repetido en ArrayList ***************/

		int resultado=0;
		for(int x : groupNumbers) {
			resultado += x;
		}
		System.out.println("Resultado suma, for-each: " + resultado);

		//5. Iterator & ListIterator
		/***************************** Iterators ***************************/
		
		resultado=0;
		Iterator<Integer> i = groupNumbers.iterator();
		while(i.hasNext()) {
			resultado += i.next();
		}
		System.out.println("Resultado suma, iterator: " + resultado);
		
		/***************************** Iterators ***************************/
		
		resultado=0;
		ListIterator<Integer> li = groupNumbers.listIterator();
		System.out.println("Impresión ---> ");
		while(li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		
		System.out.println("");
		System.out.println("Impresión <--- ");
		while( li.hasPrevious() ) {
			System.out.print(li.previous() + " ");
		}
			
	}

}
