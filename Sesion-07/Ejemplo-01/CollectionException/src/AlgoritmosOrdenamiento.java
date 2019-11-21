
public class AlgoritmosOrdenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {5, 7, 2, 15, 3};
		//seleccion(numeros);
		//burbuja(numeros);
		//combinacion(numeros);
	}

	public static void burbuja(int numeros[]){
		System.out.println("Ordenamiento por burbuja");
		for(int j =0 ; j < numeros.length; j++){      
			for(int i = 0; i < numeros.length-1; i++){         
				//if the numbers aren't in oreder
				if(numeros[i] > numeros[i+1]){
					//swap the numbers
					int temp = numeros[i];
					numeros[i] = numeros[i+1];
					numeros[i+1] = temp;
					imprime(numeros);
				}
			}			
		}			
	}
	
	public static void combinacion(int numeros[]){
		for(int i = 0; i < numeros.length; i++){
			  System.out.println();
			  mergeSort_srt(numeros,0,numeros.length-1);
			  System.out.print("Values after the sort:\n");
			  for(i = 0; i <numeros.length; i++)
				  System.out.print(numeros[i]+"  ");
			  System.out.println();
			  }	
	}
	
	public static void mergeSort_srt(int array[],int lo, int n){
		imprime(array);
		//System.out.println("Dividiendo: " + array[lo] + " " + array[n]);
		int low = lo;
		int high = n;
		if (low >= high) {
			return;
		}
		
		int middle = (low + high) / 2;
		mergeSort_srt(array, low, middle);
		mergeSort_srt(array, middle + 1, high);
		int end_low = middle;
		int start_high = middle + 1;
		while ((lo <= end_low) && (start_high <= high)) {
			if (array[low] < array[start_high]) {
				low++;
		  } else {
			  int Temp = array[start_high];
			  for (int k = start_high- 1; k >= low; k--) {
				  array[k+1] = array[k];
			  }
			  array[low] = Temp;
			  low++;
			  end_low++;
			  start_high++;
		  }
		}
		
	}  
	
	public static void seleccion(int numeros[]){
		int indicador = 0;
		for(int i=0 ; i<numeros.length; i++){
			for(int y=i+1 ; y<numeros.length; y++){
				if( numeros[indicador] > numeros[y] ){
					int temp=numeros[indicador];
					numeros[indicador]=numeros[y];
					numeros[y]=temp;
				}
			}
			indicador++;
			imprime(numeros);
		}
	}
	
	public static void imprime(int []numeros){
		for(int x:numeros){
			System.out.print(x + ",");
		}
		System.out.println();
	}
}
