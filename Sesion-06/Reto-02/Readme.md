
`Java SE`> `Herencia & Polimorfismo` > `Sesión 06` > `Reto 02`

## Reto 02 - Polimorfismo

### OBJETIVO

- Fortalecer el concepto de Polimorfismo, implementando código.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>Figuras</b> trabajado en el <b>Reto 01</b>.

<hr>

#### DESARROLLO
   
#### Modificación de clases.

1. Abre la clase <b>Circulo</b>.

   - Sobreescribe el método <b>calculaArea</b> de la clase Figura, en la clase actual <b>Circulo</b>.
   - Implementa el código para calcular el área de un Círculo.
   
   			public void calculaArea(){
				System.out.println("Calculando área Círculo: " + Math.PI * Math.pow(radio,2) );
				}  
		
2. Abre la clase <b>Cuadrado</b>.

   - Sobreescribe el método <b>calculaArea</b> de la clase Figura, en la clase actual <b>Cuadrado</b>.
   - Implementa en el, código para calcular el área de un Cuadrado.
      		 
3. Abre la clase <b>Triangulo</b>.

   - Sobreescribe el método <b>calculaArea</b> de la clase Figura, en la clase actual <b>Triangulo</b>.
   - Implementa en el, código para calcular el área de un Triángulo.
   
4. Abre la clase <b>FiguraTest</b>.

   - En el método <b>main</b> cuentas con una instancia de tipo <b>Circulo</b>, otra de tipo <b>Triangulo</b>, y una de tipo <b>Cuadrado</b>.
   - Elimina la línea que imprime un mensaje.
   - De la instancia de tipo <b>Circulo</b>, <b>Triangulo</b> y <b>Cuadrado</b>, invoca el método para calcular el área de cada objeto.
  
  			public static void main(String[] args) {
				Circulo c = new Circulo(); //Declarando instancia de tipo Círculo;
				Triangulo t = new Triangulo(); //Declarando instancia de tipo Triángulo;
				Cuadrado cu = new Cuadrado(); //Declarando instancia de tipo Cuadrado;
				c.calculaArea();
				t.calculaArea();	
				cu.calculaArea();
				}
   
#### Ejecutando proyecto

1. Ejecuta tu proyecto, observa que el mismo método <b>calculaArea()</b>, se ejecutó de forma distinta según el tipo de objeto que lo invocaba.

![Console](https://user-images.githubusercontent.com/56565204/67805076-e0ab5600-fa55-11e9-831d-957afc6302b5.png)

<hr>

Felicidades, ¡Lograste los objetivos!
