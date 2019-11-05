
`Java SE`> `Paquetes & Diseño Clases: Clases Abstractas & Interfaces` > `Sesión 08` > `Reto 02`

## Reto 01 - Clases Abstractas

### OBJETIVO

- Fortalecer con ejemplos los conceptos relacionados a manipulación de clases abstractas.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
2. Contar con el proyecto <b>Figuras</b>, trabajado en el <b>Reto 01</b>

<hr>

#### DESARROLLO

##### Modificación de Proyecto.

1. Abre el proyecto llamado <b>Figuras</b> trabajado durante el <b>Reto 01</b>
   
#### Modificación de clases.

1. Abre la clase <b>FigurasTest</b>:

	- En el método <b>main</b>, encontrarás una serie de instancias creadas previamente. 
	- Intenta agreagar una instancia más de tipo <b>Figura</b>. ¿Es esto posible?	

2. Modificación de la clase <b>Figura</b>

	- Agrega el modificador <b>abstract</b> a la clase <b>Figura</b>.
	- Convierte el método <b>calculaArea</b> de <b>concrecto a abstracto</b>.
		
			package com.proyecto.figuras;
		
			public abstract class Figura {
				public String color;

				public Figura() {
					System.out.println("Constructor Figura...");
				}
		
				public abstract void calculaArea();
			}
	
3. Valida que la clase <b>Circulo, Cuadrado & Triangulo</b>, ya tengan implementado el método abstracto <b>calculaArea</b> de la clase <b>Figura</b>, si no es así, impleméntalo.

4. Regresa a la clase <b>FigurasTest</b>

	- Debes ver un error en la línea donde se esta crando una instancia de tipo <b>Figura</b>.
	- <b>Razón</b>: Esta ya es una clase <b>abstracta</b>, no puede ser instanciada.
	- Elimina la línea.
	
5. En el método <b>main</b> tienes varias instancias de subclases de la clase <b>Figura</b>, de cada instancia, invoca el método <b>calculaArea</b> implementado en cada clase.

		Circulo c = new Circulo(); //Declarando instancia de tipo Círculo;
		Triangulo t = new Triangulo(); //Declarando instancia de tipo Triángulo;
		Cuadrado cu = new Cuadrado(); //Declarando instancia de tipo Cuadrado;
		
		c.calculaArea();
		t.calculaArea();
		cu.calculaArea();

	
#### Ejecutando proyecto

1. Ejecuta tu proyecto.

![Console](https://user-images.githubusercontent.com/56565204/68255173-289c2100-fff2-11e9-853a-2af9de04d614.png)

<hr>

Felicidades, ¡Lograste los objetivos!
