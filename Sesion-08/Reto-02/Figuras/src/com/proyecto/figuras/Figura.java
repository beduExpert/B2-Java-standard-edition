package com.proyecto.figuras;

public abstract class Figura {
	public String color;
	
	public Figura() {
		System.out.print("Constructor Figura...");
	}
	
	
	public abstract void calculaArea();
}
