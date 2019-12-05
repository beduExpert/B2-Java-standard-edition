
public class EjemploCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejemploFor();
		//ejemploWhile();
		//ejemploDoWhile();
	}

	public static void ejemploDoWhile(){
		int i=1;
		do {
			System.out.println("Iteración número: " + i);
			i++;
		}while( i<=10 );
	}
	
	public static void ejemploWhile(){
		int i=1;
		while( i<=10 ) {
			System.out.println("Iteración número: " + i);			
			i++;		
		}
	}
	
	public static void ejemploFor() {
		for(int i=1; i<=10; i++) {
			System.out.println("Iteración número: " + i);
		}
	}
}

/*public static void ejemploWhile(){
	int i=1;
	label:
	while( i<=10 ) {
		System.out.println("Iteración número: " + i);			
		i++;
		int z=0;
		while(z<5) {
			z++;
			if(z==2)continue;
			System.out.println("Ciclo interno, iteración número: " + z);
		}
	}
}*/