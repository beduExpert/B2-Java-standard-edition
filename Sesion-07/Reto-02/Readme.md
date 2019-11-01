 
``Java SE`> `ArrayList & Excpetions` > `Sesión 07` > `Reto 02`

## Reto 02 - Exceptions

### OBJETIVO

- Fortalecer con ejemplos el manejo de exceptions.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>Sesion07</b> trabajado en el <b>Reto 01</b>.

<hr>

#### DESARROLLO
   
#### Declarando y programando nueva clase.

El objetivo de este ejercico es practicar la lectura de un archivo con un Scanner, sumar los valores enteros encontrados en cada líne e imprimir el resultado.

1. Declara la clase <b>PruebaScanner</b>.

2. En el proyecto se agregó un file llamado: <b>archivo</b>.

   - Declara un variable de tipo que haga referencia al archivo en el proyecto.
   
   		Path p = Paths.get("archivo");
		
3. Declara un objeto de tipo <b>Scanner</b> que permitar leer del archivo indicado en el objeto de tipo Path.

   - Declara el código neceario para manejar una exception. (Si es necesario).
      		 
4. Utiliza un ciclo while para que mientras encuentres líneas en el archivo, se lea el objeto de tipo <b>String y los dos enteros</b> encontrados en cada línea.

		while(s.hasNext()) {
			String numSuma = s.next();
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			
		}
		
5. <b>Suma los números enteros</b> recién leídos e imprime el resultado concatenado al objeto de tipo <b>String</b> encontrado en el archivo.
			
   
#### Ejecutando proyecto

1. Ejecuta tu proyecto, comprueba el resultado de la suma de números. 

![Console](https://user-images.githubusercontent.com/56565204/67805076-e0ab5600-fa55-11e9-831d-957afc6302b5.png)

<hr>

Felicidades, ¡Lograste los objetivos!
