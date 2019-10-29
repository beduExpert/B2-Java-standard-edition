 
`Java SE`> `Herencia & Polimorfismo` > `Sesión 06` > `Reto 01`

## Reto 01 - Herencia

### OBJETIVO

- Fortalecer el concepto de Herencia, implementando código.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.

<hr>

#### DESARROLLO

##### Creación de Proyecto.

1. En Eclipse, crea un nuevo proyecto llamado <b>Figuras</b>
   
#### Declaración de clases.

1. Declara la clase <b>Figura</b> en el proyecto.

   Agrega una variable de instancia llamada color, tipo: String
   
   	public class Figura {
		public String color;
		}
		
2. Declara la clase <b>Circulo</b>. 
   - No olvides utilizar la palabra reservada <b>extends</b> para indicar que es <b>Subclase de Figura</b>.
   - Agrega una variable de instancia llamada <b>radio</b>, de tipo <b>float</b> con el valor inicial <b>4.5f</b>.
  
			public class Circulo extends Figura {
				public float radio=4.5f;
			}
			
3. Declara la clase <b>Cuadrado</b>. 
   - No olvides utilizar la palabra reservada <b>extends</b> para indicar que es <b>Subclase de Figura</b>.
   - Agrega una variable de instancia llamada <b>lado</b>, de tipo <b>int</b> con el valor inicial <b>3</b>.
   
4. Declara la clase <b>Triangulo</b>. 
   - No olvides utilizar la palabra reservada <b>extends</b> para indicar que es <b>Subclase de Figura</b>.
   - Agrega una variable de instancia llamada <b>altura</b>, de tipo <b>int</b> con el valor inicial <b>5</b>.
   - Agrega una variable de instancia llamada <b>base</b>, de tipo <b>int</b> con el valor inicial <b>8</b>.
   
5. Declara la clase principal <b>FigurasTest</b>.
   - No olvides agregar el método main.
   - Declara una instancia de tipo Circulo, otra de tipo Triangulo, al final, una de tipo Cuadrado.
   - Declara una línea que imprima el mensaje: Teminando de crear instancias...
   
#### Ejecutando proyecto

1. Ejecuta tu proyecto, por el momento, solo deberás ver el mensaje declarado en el punto anterior.

![Console](https://user-images.githubusercontent.com/56565204/67644097-e6812a00-f8e3-11e9-8a57-64d333ad7c81.png)

<hr>

Felicidades, ¡Lograste los objetivos!
