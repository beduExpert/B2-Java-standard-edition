
public class SobrecargaMetodos {
	
	public static void suma(int x, int y){
		int suma = x + y;
		System.out.println(suma);
	}
	
	public static void suma(int x, int y,int z){
		int suma = x + y + z;
		System.out.println(suma);
	}
	
	public static void suma(int x, int y,int z, int a){
		System.out.println("ENTEROS");
		int suma = x + y + z + a;
		System.out.println(suma);
	}		

	public static void suma(int x, int y, int z, int a, int b) {
		int suma = x+y+a+b;
		System.out.println(suma);
	}
	
	public static void suma(int ...x) {
		int suma = 0;
		
		for( int temp : x) {
			suma = suma + temp;
		}
		
		System.out.println(suma);		
	}	

	
	public static void main(String args[]) {
		suma(1);
	}
}
