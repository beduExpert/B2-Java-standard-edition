
`Java SE`> `Polimorfismo & Collections` > `Sesión 06` > `Ejemplo 02`

## Ejemplo 02 - instanceof

### OBJETIVO

- Fortalecer el concepto de Polimorfismo, implementando código.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>Figuras</b> trabajado en el <b>Reto 01</b>.

<hr>

#### DESARROLLO
   
#### Comprobando necesidad de aplicación del operador instanceof.

1. Abre la clase <b>FiguraTest</b>.

   - Comenta todas las líneas donde es invocado el método <b>calculaArea</b> de cada instancia.
   - Observa y analiza el método <b>calculadorAreas()</b>. Método polimórfico...
   - Invoca el método polimórfico, envíandole una instancia de tipo Círculo.
   
2. Intenta imprimir el valor de la propiedad radio del Círculo enviado como argumento.
   
   			System.out.println("El valor del radio es: " + f.radio );  
		
3. El punto anterior generará un error, no puedes acceder a las características de <b>Circulo</b> desde una referencia de tipo <b>Figura.</b>

   - Solución: Aplicar <b>instanceof</b>(validación de tipo de instancia) & <b>Casting</b>.
   
   			if( f instanceof Circulo ) {
				Circulo c = (Circulo)f;
				System.out.println("El radio es: " + c.radio);
			}else {
				if( f instanceof Triangulo ) {
					Triangulo t = (Triangulo)f;
					System.out.println("La base del Triángulo es: " + t.altura + " , Altura del Triángulo es: " + t.base);
				}else {
					if( f instanceof Cuadrado ) {
						Cuadrado c = (Cuadrado)f;
						System.out.println("El lado del Cuadrado es: " + c.lado);
					}
				}
			}
			
#### Ejecutando proyecto

1. Ejecuta tu proyecto, observa que puedes acceder a las propiedades particulares de cada objeto, después de validar la instancia <b>(instanceof)</b> y después de aplicar <b>Casting</b>

![Console](https://user-images.githubusercontent.com/56565204/70399466-de8bce00-19e9-11ea-8b4c-4eefa0930500.png)

<hr>

Felicidades, ¡Lograste los objetivos!
