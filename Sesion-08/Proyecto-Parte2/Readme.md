
`Java SE`> `Paquetes & Diseño Clases: Clases Abstractas & Interfaces` > `Sesión 08` > `Proyecto-Parte2`

## UniversidadMexico (Parte 2) - Clases Abstractas

### OBJETIVO

- El Alumno será capaz de declarar y manipular Clases Abstractas.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>UniversidadMexico</b> trabajado anteriormente.

<hr>

#### DESARROLLO
   
###### Creando Clases Abstractas

1. Para poder prestar un libro a un alumno, necesitamos saber que tipo de libro es.
  
   - Corrige el diseño de clases para que esto sea posible.
   - Declara como clase abstracta la clase <b>Libro</b>.
   
2. El método tiempoRetorno, depende del tipo de libro prestado. Por lo tanto, este es un método abstracto.

   - Corrige el diseño de la clase <Libro> para que el método <b>tiempoRetorno</b> sea declarado como abstracto.
   
3. Las clases <b>FilosofiaLibro, FisicaLibro, PoliticaLibro</b> ya deben estar implementando el método <b>tiempoRetorno</b>.

   - Recuerda: Antes estaba implementado por sobreescritura.
   - Ahora esta implementado vía una clase abstracta.

###### Creando Método Polimórfico

1. En la clase principal declara el método <b>sistemaRetornaLibros</b>, características:

	- Modificadores: public, static
	- Tipo Retorno: void
	- Nombre Metodo: sistemaRetornaLibros
	- Argumentos: ArrayList<Libro>
 
 2. El método recién declarado, debe de revisar cada libro que recibe en el argumento de tipo <b>ArrayList<Libro></b>. Revisar o encontrar que tipo de instancia es cada libro e invocar el método <b>tiempoRetorno</b> de cada uno.
	
		public static void sistemaRetornaLibros( ArrayList<Libro> libros) {
			for( Libro l : libros) {
				if( l instanceof FilosofiaLibro ) {
					l.tiempoRetorno();
				}else {
					if( l instanceof FisicaLibro ) {
						l.tiempoRetorno();
					}else {
						if( l instanceof PoliticaLibro ) {
							l.tiempoRetorno();
						}
					}				
				}
			}
		}
	
3. Modifica el método <b>main</b>
 	
	1. Después de registrar alumnos, imprima el mensaje: <b>Prestando libros a alumno...</b>
	2. Cuentas con una lista de alumnos recién registrados, utiliza el método get(...) de esa lista para obtener el alumno en la posición <b>0</b>.
		
		Alumno a1 = lista.get(0);
		
	3. Del alumno obtenido en el punto anterior, invoca el método <b>addLibro</b>, para agregar respectivamente un libro de tipo <b>FilosofiaLibro</b> y otro de tipo <b>PoliticaLibro</b>.
	
	4. Imprime el mensaje: <b>¿Cuándo debo regresar libros?</b>
	5. Invoca el método <b>sistemaRetornaLibros</b>, envía como argumento la lista de libros prestado al alumno obtenido en el punto 2.	

		sistemaRetornaLibros(a1.getListaLibros());

4. Ejecuta el proyecto.

![Console](https://user-images.githubusercontent.com/56565204/67881593-5ff86280-fb06-11e9-84ae-319e67b8146c.png)

Si llegaste aquí, Felicidades - lograste los objetivos!!

![d2zdiy7-5b4587d4-3ccd-4854-9ed9-5df10f56593f](https://user-images.githubusercontent.com/56565204/67228451-e625f200-f3fe-11e9-99ce-ad733b945ebd.png)

<details>
	<summary>Solucion</summary>
	<p> 1. Convertir la clase <b>Libro</b> y su método <b>tiempoRetorno</b> en abstractos.
	<p> 2. Asegurarse de que las <b>Subclases de Libro<b>, esten implementando de forma correcta la clase abstracta.
        <p> 3. Creando método polimórfico e invocación. 
	<p> 4. Ejecuta el proyecto</p>
</details> 

<hr>

Felicidades, ¡Lograste los objetivos!
