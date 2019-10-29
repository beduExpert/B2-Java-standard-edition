 
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

   Agrega una variable de instancia llamada color, tipo: <b>String</b>
   
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
   - No olvides agregar el método <b>main</b>.
   - Declara una instancia de tipo <b>Circulo</b>, otra de tipo <b>Triangulo</b>, al final, una de tipo <b>Cuadrado</b>.
   - Declara una línea que imprima el mensaje: <b>Teminando de crear instancias...</b>
   
#### Ejecutando proyecto

1. Ejecuta tu proyecto, por el momento, solo deberás ver el mensaje declarado en el punto anterior.

![Console](https://user-images.githubusercontent.com/56565204/67800533-04b66980-fa4d-11e9-82b2-19c9b1949086.png)

<hr>

Felicidades, ¡Lograste los objetivos!
