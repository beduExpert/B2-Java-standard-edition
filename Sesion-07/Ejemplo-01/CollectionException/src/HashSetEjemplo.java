import java.util.*;
public class HashSetEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>(); //1. Declaración de objeto de tipo HashSet
		set.add("Arbol");							 //2. Agregando elementos a la colección con el método add.
		set.add("Casa");
		set.add("Dedo");
		set.add(null);
		set.add(null);
		
		System.out.println(set.add("Arbol"));
		System.out.println(set);
	}

}
