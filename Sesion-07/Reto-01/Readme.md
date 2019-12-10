 
`Java SE`> `ArrayList & Exceptions / Paquetes` > `Sesión 07` > `Reto 01`

## Reto 01 - ArrayList

### OBJETIVO

- Fortalecer con ejemplos los conceptos relacionados a un Objeto de tipo ArrayList.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.

<hr>

#### DESARROLLO

##### Creación de Proyecto.

1. En Eclipse, crea un nuevo proyecto llamado <b>Sesion07</b>
   
#### Declaración de clases.

1. Declara la clase <b>PruebaArrayList</b> en el proyecto, no olvides agregarle el método main.
		
2. Declara un objeto de tipo <b>ArrayList</b> que contenga el nombre de mínimo 4 miembros de tu familia.

		ArrayList<String> familia = new ArrayList<String>();
		familia.add("Nombre1");
		familia.add("Nombre2");
		familia.add("Nombre3");
		familia.add("Nombre4");
		
    - Nota: No olivdes que para trabajar con un ArrayList, necesitas importar la clase <b>ArrayList</b>, del paquete <b>java.util</b>
			
3. Imprime el <b>ArrayList</b> recien creado e inicializado
   
4. Elimina el último nombre agregado al <b>ArrayList</b>. 
   
   Pista: 
   	- Utiliza el método remove(...) de la clase <b>ArrayList</b>. 
	- Consulta API si tienes alguna duda.
	
5. Imprime el <b>ArrayList</b> recien creado e inicializado

6. Agrega en el <b>índice 0</b> del ArrayList el elemento que eliminaste en el punto 4.

   Pista: 
   	- Utiliza el método add(int,Object) de la clase <b>ArrayList</b>.
   	- Consulta API si tienes alguna duda.
	
7. Recorre tu ArrayList con un ListIterator.

		ListIterator<String> li = familia.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
#### Ejecutando proyecto

1. Ejecuta tu proyecto.

![Console](https://user-images.githubusercontent.com/56565204/68001136-64b53780-fc28-11e9-85e2-b835bbb05b61.png)

<hr>

Felicidades, ¡Lograste los objetivos!
