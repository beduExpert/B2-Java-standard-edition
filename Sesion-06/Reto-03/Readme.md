 
`Java SE`> `Herencia & Polimorfismo` > `Sesión 06` > `Reto 03`

## Reto 03 - Herencia & Constructores

### OBJETIVO

- Fortalecer el concepto de Polimorfismo, implementando código.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>Figuras</b> trabajado en el <b>Reto 02</b>.

<hr>

#### DESARROLLO
   
#### Modificación de clases.

1. Abre la clase <b>Figura</b>.

   - Declara un constructor que no reciba argumentos y que imprima el mensaje: <b>Constructor Figura...</b>
   
   			public Figura() {
				System.out.println("Constructor Figura...");
				}

2. Abre la clase <b>Circulo</b>.

   - Declara un constructor que no reciba argumentos y que imprima el mensaje: <b>Constructor Círculo...</b>
   
   			public Circulo() {
				System.out.println("Constructor Círculo...");
			}
	
3. Abre la clase <b>Cuadrado</b>.

   - Declara un constructor que no reciba argumentos y que imprima el mensaje: <b>Constructor Cuadrado...</b>
      		 
4. Abre la clase <b>Triangulo</b>.

    - Declara un constructor que no reciba argumentos y que imprima el mensaje: <b>Constructor Triángulo...</b>
   
5. Abre la clase <b>FiguraTest</b>.

   - En el método <b>main</b> cuentas con una instancia de tipo <b>Circulo</b>, otra de tipo <b>Triangulo</b>, y una de tipo <b>Cuadrado</b>.
   - Elimina las líneas que calculan área.
   
#### Ejecutando proyecto

1. Ejecuta tu proyecto, observa los mensajes, comprobamos la cadena de invocación de los constructores.

![Console](https://user-images.githubusercontent.com/56565204/67810841-012cdd80-fa61-11e9-873f-8098b65cce05.png)

<hr>

Felicidades, ¡Lograste los objetivos!
