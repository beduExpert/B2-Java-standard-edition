package com.proyecto._interfaces.mejora;

public interface Flyer {
	public void aterriza();
	public void despega();
	public void volando();
	
	default void comunicaTorreControl() {
		System.out.println("La comunicación siempre será igual...");
	}
	
	static void asignacionPistas() {
		System.out.println("Asignando pista...");	
	}

	private void metodo() {
		System.out.println("Método privado");
	}
}
