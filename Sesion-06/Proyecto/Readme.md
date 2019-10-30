
`Java SE`> `Herencia & Polimorfismo` > `Sesión 06` > `Proyecto`

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

1. Declara el método <b>tiempoRetorno</b>

1. Declara la clase <b>FisicaLibro</b>, no olvides utilzar <b>extends</b> para establecer la relación de Herencia con la clase <b>Libro</b>
2. Sobreescribe el método <b>tiempoRetorno</b>. Debe de arrojar el siguiente mensaje: <b>Libro Física, se retorna en 3 días...</b>
3. Repite el paso 1 y 2 para declarar las clases:  <b>FilosofíaLibro</b>,  <b>PoliticaLibro</b>
   Nota: El tiempo de retorno de de un libro de <b>Filosofía es 10 días</b> y el tiempo de retorno de un libro de <b>Politica es de 5 días<b>.

###### Modificando clase Alumno

1. Declara una constante que indique cuál es el número máximo de libros que un alumno puede sacar de la Biblioteca. Características:

   - Nombre: <b>MAX_LIBROS</b>
   - Tipo Dato: <b>int</b>
   - Valor asignado: <b>3</b>
   - No olvides utilizar el modificador <b>final</b> para lograr que esta sea una constante.
   
2. Declara una variable de instancia que permita saber cuántos libros tiene asignado hasta el momento el Alumno. Características:

   - Nombre: <b>libroActual</b>
   - Tipo Dato: <b>int</b>
   - Valor inicial: <b>0</b>
  
3. Modifica la variable de instancia <b>listaLibros</b>.  

   - Línea actual: <b>public Libro []listaLibros = new Libro[3];</b>
   - Modificación: <b>public Libro []listaLibros = new Libro[MAX_LIBROS];</b>
   
3. Declara el método <b>addLibro</b>. Características: 

   - Tipo de retorno: <b>void</b>
   - Nombre: <b>addLibro</b>
   - Lista de argumentos: Una variable de tipo Libro
   - Código: 
      - Verifica que el Alumno alcanzara aún el máximo número de libros que puede obtener.
      - Si es asi, imprime un mensaje que indique que ya no es posible obtener más libros.
      - De lo contrario, asigna el nuevo libro al arreglo de libros en la posición de libro actual.
      - Incrementa la variable que te permite controlar la posición de libro actual.
      - Imprime el mensaje Libro Agregado
   
<hr>

##### Declaración de constructor:

###### Modificación clase Alumno:

1. Declara un constructor en la clase <b>Alumno</b> que permita inicializar las propiedades de un objeto de tipo <b>Alumno</b>.

   Nota: Por le momento no consideres en la incialización en constructor el arreglo de libros.
   
2. Modifica el código que sea necesario para crear e inicializar un objeto de tipo Alumno por medio del constructor recién creado.
3. Ejecuta código.

![Console](https://user-images.githubusercontent.com/56565204/67613052-86b54280-f76e-11e9-93b5-af54e9c527a6.png)

Si llegaste aquí, Felicidades - lograste los objetivos!!

![d2zdiy7-5b4587d4-3ccd-4854-9ed9-5df10f56593f](https://user-images.githubusercontent.com/56565204/67228451-e625f200-f3fe-11e9-99ce-ad733b945ebd.png)

<details>
	<summary>Solucion</summary>
	<p> 1. Encapsula la clase <b>Alumno</b> y <b>Libro</b>.</b>. </p>
	<p> 2. Declaración de método estático, <b>RegistraAlumno</b> </p>
	<p> 3. Declaración de constructor en clase <b>Alumno<b></p>
	<p> 4. Modificación de código previamente creado para crear y asignar valores iniciales a las instancias de tipo <b>Alumno</b></p>
	<p> 5. Ejecuta el proyecto</p>
</details> 
