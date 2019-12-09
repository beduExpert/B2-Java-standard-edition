
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
   
#### Ejecutando proyecto

1. Ejecuta tu proyecto, observa que puedes acceder a las propiedades particulares de cada objeto, después de validar la instancia <b>(instancof)</b> y después de aplicar <b>Casting</b>


<hr>

Felicidades, ¡Lograste los objetivos!
