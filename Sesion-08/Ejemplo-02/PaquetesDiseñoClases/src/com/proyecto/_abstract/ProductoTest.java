package com.proyecto._abstract;

public class ProductoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Mostrar clase Product (Clase concreta), mostrar capacidad de instanciación.
		Product p = new Product();
		
		//2. Comenta la clase Product y quita comentarios a la clase declarada posteriormente en el mismo archivo.
		//2.1 Debe mostrarse error en el intento de crear instancia de la clase Product (Línea de código anterior).
		//2.2 Comenta error.
		
		//3. Utiiza la palabra reservada extends para indicar que Refresco y Medicina son subclases de Product.
		//3.1 Muestra el error de ambas clases.
		//3.2 Implementa el método calculandoImpuesto para Refresco(10%) y para Medicina(16%).
		//3.3 Muestra la no existencia de error.
		
		//4. Intenta instanciar un objeto de tipo Refresco y de tipo Medicina
		/*Refresco f = new Refresco();
		Medicina m = new Medicina();*/
		
		//5. Declara en esta misma clase un método con un argumento polimórfico, ejecuta el método calculando impuesto de cada clase.
		
		//6. Ejecuta y explica ejecución.
	}
}

/*public static void impuestos(Product p) {
	if ( p instanceof Medicina ) {
		System.out.println("Calculando impuesto medicina...");
		p.calculandoImpuesto();
	}else {
		if( p instanceof Refresco ) {	
			System.out.println("Calculando impuesto refrescos...");
			p.calculandoImpuesto();
		}
	}
}*/
