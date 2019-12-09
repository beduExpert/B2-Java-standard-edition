import java.util.*;

public class StackEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>(); //1.Declaración de objeto de tipo Stack.
		
		System.out.println("¿Está vacía la pila? " + s.empty()); //2. Probar el método empty.
		System.out.println();
		
		System.out.println("Operaciones push...");
		System.out.println("Insertado elemento: " + s.push("Arbol"));
		System.out.println("Insertado elemento: " + s.push("Bob"));
		System.out.println("Insertado elemento: " + s.push("Casa"));
		System.out.println("Insertado elemento: " + s.push("Dedo"));
		System.out.println();
		
		System.out.println("Pila de Strings: ");
		System.out.println(s);
		System.out.println();
		
		System.out.println("Pop: ");
		System.out.println(s.pop());
		
		System.out.println("Pila de Strings: ");
		System.out.println(s);
		System.out.println();
		
		System.out.println("Peek: ");
		System.out.println(s.peek());
		
		System.out.println("Pila de Strings: ");
		System.out.println(s);
		System.out.println();
		
		System.out.println("Searching Casa: ");
		System.out.println(s.search("Bob"));	

	}
	
}