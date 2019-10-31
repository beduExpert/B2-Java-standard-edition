import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.- Arreglo
		/************************ Arreglo ********************/

		String[] array1 = new String[3];
		array1[0]="Manuel";
		array1[1]="Izumy";
		array1[2]="Nochipa";

		array1 = new String[6];		
		
		for( String temp : array1) {
			System.out.println(temp);
		}

		//2.- ArrayList
		/************************ ArrayList de nombres ********************/
	    /*ArrayList<String> groupNames = new ArrayList<String>();
		groupNames.add("Manuel");
		groupNames.add("Izumy");
		groupNames.add("Nochipa");
		
		System.out.println("Imprimiendo ArrayList: " + groupNames);
	    System.out.println("Tamaño ArrayList: " + groupNames.size());		
		System.out.println("Obteniendo objeto en la posición 1 del ArrayList: " + groupNames.get(1));		
		System.out.println("Eliminando Objeto en la posición 2 del ArrayList: " + groupNames.remove(2)); 
		System.out.println("Imprimiendo ArrayList: " + groupNames);*/
		
		//3.- Collections
		/************************ Collections.sort ********************/
		
		/*Collections.sort(groupNames);
		System.out.println(groupNames);*/
		
		//4.- Valor repetido
		/*********************** Valor repetido en ArrayList ***************/
		
		/*groupNames.add("Izumy");
		System.out.println(groupNames);*/
			
	}

}
