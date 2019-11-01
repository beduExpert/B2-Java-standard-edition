import java.util.ArrayList;
import java.util.ListIterator;

public class PruebaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> familia = new ArrayList<String>();
		familia.add("Elena");
		familia.add("Toño");
		familia.add("Midory");
		familia.add("Coco");
		
		System.out.println("Imprimiendo ArrayList...");
		System.out.println(familia);
		System.out.println();
		
		System.out.println("Eliminando elemento ArrayList...");
		familia.remove("Coco");
		System.out.println();

		System.out.println("Imprimiendo ArrayList...");
		System.out.println(familia);
		System.out.println();
		
		System.out.println("Agregando en índice 0 del ArrayList...");
		familia.add(0, "Coco");
		System.out.println();
		
		System.out.println("Imprimiendo ArrayList...");
		System.out.println(familia);
		System.out.println();
		
		System.out.println("Recorriendo ArrayList con ListIterator");
		ListIterator<String> li = familia.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
