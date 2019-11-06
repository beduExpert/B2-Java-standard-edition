package com.proyecto._abstract;


public class Product {
	public String nombre; 							//Field heredado
	
	public Product() {	  							//Constructor invocado
		System.out.println("Creando producto...");
	}	
}

/*public abstract class Product {
	public String nombre; 							//Field heredado
	
	public Product() {	  							//Constructor invocado
		System.out.println("Creando producto...");
	}
	
	public abstract void calculandoImpuesto();		//Método abstracto, deberá ser implementado por subclases.
}*/
