package com.proyecto._interfaces;

public class FlyerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Muestra y explica el código de la interfaz Flyer.
		//2. Muestra y explica el código de la clase Avión & Helicoptero.
		//3. Muestra y explica el código de la clase Animal.
		//4. Muestra y explica el código de la clase Superman que hereda de Animal e Implementa de Flyer.
		//5. Crea una instancia de tipo Avión, otra de tipo Helicoptero y otra de tipo Superman.				
	}
	
	public static void aeropuerto( Flyer f ) {
		if( f instanceof Avion ) {
			f.aterriza();
		}else {
			if(f instanceof Helicoptero ) {
				f.aterriza();
			}else {
				if(f instanceof Superman ) {
					f.aterriza();
				}
			}
		}
	}

}
