package com.proyecto._interfaces.mejora;

public class FlyerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flyer.asignacionPistas(); //1.- Invoca el método static de la interfaz Flyer		
		Avion a = new Avion();    //2.- Crea una instancia de una clase que implemente la interfaz Flyer.		
		a.aterriza();			  //3.- Invoca lo métodos implementados a partir de la interfaz Flyer
		a.volando();
		a.despega();
		a.comunicaTorreControl(); //4.- Invoca el método default de la interfaz Flyer.
	   						      //5.- Desde la interfaz Flyer, invoca el método privado dentro del método con el modificaodr default en la interfaz.
	}
	
	public static void aeropuerto( Flyer f ) {
		if( f instanceof Avion ) {
			f.aterriza();
		}else {
			if(f instanceof Helicoptero ) {
				f.aterriza();
			}
		}
	}

}
