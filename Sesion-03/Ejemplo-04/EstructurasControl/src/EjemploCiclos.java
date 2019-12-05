import java.util.Scanner;
public class EjemploCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejemploFor();
		//ejemploWhile();
		//ejemploDoWhile();
		centinela(); //Centinela | Bandera
	}

	public static void centinela() {
		int num, suma = 0;
		System.out.println("Introduce un número para iniciar una suma: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while( true ) {
			suma = suma + num;
			System.out.println("Introduce otro número o 999 para salir: ");
			num = s.nextInt();
			if( num!=999 ) {
				suma += num;
			}else {
				break;
			}
		}
		System.out.println("Valor final de suma: " + suma);
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
		/*for(int i=1; i<=5; i++) {
			System.out.println("Iteración número: " + i);			
		}*/	
		System.out.println("Ejemplo For: ");			
		for(int i=1; i<=5; i++) {
			System.out.println("Iteración número: " + i);			
			for(int x=0 ; x<=3 ; x++) {
				if(x==2) {
					return;
				}
				System.out.println("X: " + x);
			}
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