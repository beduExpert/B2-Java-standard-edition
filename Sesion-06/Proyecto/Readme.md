
`Java SE`> `Polimorfismo & Collections` > `Sesión 06` > `Proyecto`

## Universidad México

### OBJETIVO

- El alumno será capaz  de declarar Subclases.
- El alumno será capaz de implementar Polimorfismo.

#### REQUISITOS

1. Proyecto UniversidadMexico modificado en la <b>Sesión 05</b>.

<hr>

#### DESARROLLO

##### Herencia

###### Modificación clase Libro

1. Declara el método <b>tiempoRetorno</b>
2. Imprime el mensaje: <b>El tiempo de retorno depende del tipo de Libro...</b>.

###### Declaración de Subclases

1. Declara la clase <b>FisicaLibro</b>, no olvides utilzar <b>extends</b> para establecer la relación de Herencia con la clase <b>Libro</b>

2. Sobreescribe el método <b>tiempoRetorno</b>. 
   - Debe de arrojar el siguiente mensaje: <b>Libro Física, se retorna en 3 días...</b>

			public class FisicaLibro extends Libro {
				public void tiempoRetorno(){
					System.out.println("Libro Física, se retorna en 3 días...");
				}
			}

3. Repite el paso 1 y 2 para declarar las clases:  <b>FilosofíaLibro</b>,  <b>PoliticaLibro</b>
   
   - Nota: 
     - El tiempo de retorno de de un libro de <b>Filosofía es 10 días</b>
     - El tiempo de retorno de un libro de <b>Politica es de 5 días</b>.
	
###### Modificando clase Alumno

1. Declara una constante que indique cuál es el número máximo de libros que un alumno puede sacar de la Biblioteca. Caracterísiticas:

   - Nombre: <b>MAX_LIBROS</b>
   - Tipo Dato: <b>int</b>
   - Valor asignado: <b>3</b>
   - No olvides utilizar el modificador <b>final</b> para lograr que esta sea una constante.
   
   	 	private final int MAX_LIBROS = 3;
   
2. Declara una variable de instancia que permita saber cuántos libros tiene asignado hasta el momento el Alumno. Características:

   - Nombre: <b>libroActual</b>
   - Tipo Dato: <b>int</b>
   - Valor inicial: <b>0</b>
  
3. Modifica la variable de instancia <b>listaLibros</b>.  

   - Línea actual: <b>public Libro []listaLibros = new Libro[3];</b>
   - Modificación: <b>public Libro []listaLibros = new Libro[MAX_LIBROS];</b>
   
4. Declara el método <b>addLibro</b>. Características: 

   - Tipo de retorno: <b>void</b>
   - Nombre: <b>addLibro</b>
   - Lista de argumentos: Una variable de tipo Libro
   - Código: 
      - Verifica que el Alumno no alcanzara aún el máximo número de libros que puede obtener.
      - Si es asi, imprime un mensaje que indique que ya no es posible obtener más libros.
      - De lo contrario, asigna el nuevo libro al arreglo de libros en la posición de libro actual.
      - Incrementa la variable que te permite controlar la posición de libro actual.
      - Imprime el mensaje Libro Agregado
   
<hr>

###### Modificando clase principal: UniversidadMexico

1. Ubica la línea donde registraste y creaste una nueva instancia de tipo <b>Alumno</b>.
   
2. Utilizando el método addLibro, prestale 3 libros al <b>Alumno</b>.

		a.addLibro(new FisicaLibro());
		a.addLibro(new FilosofiaLibro());
		a.addLibro(new PoliticaLibro());
		
3. Intenta prestarle un libro más al alumno. 
   Recuerda: Tu codigo ya debe de tener validado que un Alumno no deba de tener en prestamo más de tres libros. Por lo cual debes de ver un mensaje que te indique ya no es posible prestar más libros.
   
4. Vamos a probar los métodos sobreescritos. Imprime el tiempo en que debe ser retornado cada uno de los libros prestados.

		System.out.println("¿En cuánto tiempo tiene que retornar los libros el alumno: " + a.getNumeroCuenta() + "?");
			for( Libro x : a.getListaLibros()) {
				x.tiempoRetorno();
			}
		
5. Ejecuta código.

![Console](https://user-images.githubusercontent.com/56565204/67881593-5ff86280-fb06-11e9-84ae-319e67b8146c.png)

Si llegaste aquí, Felicidades - lograste los objetivos!!

![d2zdiy7-5b4587d4-3ccd-4854-9ed9-5df10f56593f](https://user-images.githubusercontent.com/56565204/67228451-e625f200-f3fe-11e9-99ce-ad733b945ebd.png)

<details>
	<summary>Solucion</summary>
	<p> 1. Declaración de método tiempoRetorno en clase <b>Libro</b>.
	<p> 2. Declaración de Subclases, <b>FisicaLibro</b>, <b>FilosofíaLibro</b>, <b>PoliticaLibro</b> </p>
	<p> 3. Sobreescribe el método <b>tiempoRetorno<b> en las clases declaradas en el punto anterior.</p>
	<p> 4. Modificación de la clase <b>Alumno</b> agregando el código necesario poder prestar libros.</p>
	<p> 5. Modificación de la clase <b>UniversidadMexico</b>, agrega el código necesario para probar las modificaciones realizadas en los puntos anteriores.</p>
	<p> 5. Ejecuta el proyecto</p>
</details> 
