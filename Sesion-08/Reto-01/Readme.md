 
`Java SE`> `Paquetes & Diseño Clases: Clases Abstractas & Interfaces` > `Sesión 08` > `Reto 01`

## Reto 01 - Paquetes

### OBJETIVO

- Fortalecer con ejemplos los conceptos relacionados a manipulación de paquetes.
<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
2. Contar con el proyecto <b>Figuras</b>, trabajado en la <b>Sesión 6</b>

<hr>

#### DESARROLLO

##### Modificación del Proyecto.

1. Abre el proyecto llamado <b>Figuras</b> trabajado durante la <b>Sesión 6</b>
   
#### Declaración de clases.

1. Crea un paquete nuevo, nombre: <b>com.proyecto.figuras</b>
2. Crea un paquete nuevo, nombre: <b>com.proyecto.principal</b>		
3. Con el mouse, arrastra la clase <b>Figura</b> y sus subclases al paquete <b>com.proyecto.figuras</b>
4. Abre la clase <b>Circulo</b>, asegurate de que la primer línea tenga la declaración de paquete correcta.

		package com.proyecto.figuras;

5. Repite el paso 4, con la clase <b>Cuadrado</b>, <b>Triangulo</b>, <b>Figura</b>
6. Con el mouse, arrastra la clase <b>FigurasTest</b> al paquete <b>com.proyecto.principal</b>	
7. Abre la clase <b>FiguraTest</b>, asegurate de que la primer línea tenga la declaración de paquete correcta.
8. En la clase <b>FiguraTest</b>, ubica las líneas que importan las clases Circulo, Cuadrado, Triangulo.
9. Elimina las líneas indicadas en el punto 8.
10. Agrega una sola línea <b>import</b> que te permita trabajar con las clase Circulo, Cuadrado, Triangulo.
	
#### Ejecutando proyecto

1. Ejecuta tu proyecto.

![Console](https://user-images.githubusercontent.com/56565204/67810841-012cdd80-fa61-11e9-873f-8098b65cce05.png)

<hr>

Felicidades, ¡Lograste los objetivos!
