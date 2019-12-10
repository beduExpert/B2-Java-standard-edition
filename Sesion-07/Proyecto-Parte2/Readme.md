
`Java SE`> `ArrayList & Exceptions / Paquetes` > `Sesión 07` > `Proyecto-Parte2`

## UniversidadMexico (Parte 2) - ArrayList

### OBJETIVO

- El alumno será capaz de leer de un archivo y manejar la excepciones derivadas de su manipulación.
- El alumno será capaz de crear instancias con las características leídas desde un archivo.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>UniversidadMexico</b> modificado en el ejercicio anterior.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

###### Agregando archivo

1. Agrega un archivo de texto a tu proyecto UniversidadMexico.

	- Click derecho en proyecto, New, File
	- Asigna el nombre de <b>archivo.txt</b>
	- Transcribe el siguiente contenido al archivo:
	 
	  - <b>En la primer línea:</b> Abigail 99087305 abi@gmail.com
	  - <b>En la segunda línea:</b> Emanuel 3399477 emanuel@gmail.com
    
###### Leyendo archivo

1. Abre la clase <b>Alumno</b>.

   - Declara como variable de clase, un objeto de tipo Path.
   - Este objeto manipulará el <b>archivo.txt</b> que contiene los datos de los alumnos a registrar.
   
	        private static Path p = Paths.get("archivo.txt"); //Generando objeto de tipo Path para manipular archivo.txt
        
   - No olvides importar del paquete <b>java.nio.file</b>, la clase <b>Path & Paths</b>
   
       		import java.nio.file.Path;
       		import java.nio.file.Paths;
          
2. Sobreescribe el método <b>toString</b> de la clase Object. Esto con la finalidad de que al imprimir un Objeto de tipo <b>Alumno</b>, se imprima <b>nombre</b>, así como <b>numeroCuenta</b>.

3. Ubica el método <b>registraAlumno</b>

   - Modifica el tipo de retorno, ahora será un <b>ArrayList</b> de objetos de tipo <b>Alumno</b>.
   
   	- Esta modificación permitirá retornar todos los Alumnos dados de alta desde el archivo de texto.
	
   - Ubica la línea donde se imprime el mensaje <b>BIENVENIDO A REGISTRO ALUMNO</b>
   - Justo en la línea de abajo, declara un  <b>ArrayList</b> de objetos de tipo <b>Alumno</b>.
   - Modifica el Objeto de tipo <b>Scanner</b> para que en lugar de leer del teclado, lea del <b>archivo.txt</b>   
   - No olvides importar del paquete <b>java.io</b>, la clase <b>File</b>. 
               
4. Agrega el código necesario para controlar la exception de tipo <b>FileNotFoundException</b> en la línea habilitada en el punto anterior.

    		try {
			    Scanner input = new Scanner( new File(p.toString()) );
		    }catch(FileNotFoundException e) {
			    System.out.println("Archivo no encontrado...");
		    }
        
    - No olvides importar del paquete <b>java.io</b>, la clase <b>FileNotFoundException</b>.
    
        	import java.io.FileNotFoundException;
                
4. Elimina todas las líneas donde se imprimie un mensaje solicitando la información al usuario.
                        
5. El resto de código que lee y valida los datos para crear la instancia de tipo <b>Alumno</b>, muévelo a bloque de código del try.
   
6.- El archivo que estamos leyendo tiene datos de más de un <b>Alumno</b>, por lo cual necesitamos habilitar un ciclo que permita seguir leyendo hasta alcanzar el final del archivo, lo llevaremos a cabo con un while.

  - Elimina la línea que cierra el objeto de tipo Scanner - Esto nos permitirá mantener operaciones de lectura sobre el archivo.
  - Agrega el while justo después de la declaración del objeto de tipo Scanner.
  	- Coondición booleana del while: 
		- Invocación del método <b>hasNext()</b> del Objeto de tipo Scanner.
		- Esto quiere decir - Mientras existan más elemento que leer en el Scanner. (Archivo)
  - Coloca el código que lee, crea y agrega la instancia al ArrayList dentro del while.
  - Al final del try/catch, retorna el ArrayList.

       		public static ArrayList<Alumno> registraAlumno() {		
		 	System.out.println("************** BIENVENIDO A REGISTRO ALUMNO ***************");
		 	ArrayList<Alumno> lista =new ArrayList<Alumno>();		 
		 	try {
		 		Scanner input = new Scanner( new File(p.toString()) );
		 		while(input.hasNext()) {
		 			String nombre = input.next();
					int numeroCuenta = input.nextInt();
					String correoElectronico = input.next();
					
					/****CREANDO INSTANCIA****/
					Alumno a = new Alumno(nombre, numeroCuenta, correoElectronico);
					lista.add(a);
					System.out.println("Éxito al registrar alumno: " + a.nombre);
					System.out.println("************************************************************");						
		 		}		 		
		 	}catch(FileNotFoundException e) {
		 		System.out.println("Archivo no encontrado");
		 	}
			return lista;			
	 	}
 
###### Modificando clase UniversidadMexico

1. Modifica la línea donde se invoca el método <b>registroAlumno</b> de la clase <b>Alumno</b>, ahora lo que obtendremos al ejecutarlo, es un <b>ArrayList</b> de objetos de tipo <b>Socio</b>.

		ArrayList<Alumno> lista = Alumno.registroSocio(); 
		
2. Imprime la lista de Alumnos recién registrados.

		System.out.println(lista);
![Console](https://user-images.githubusercontent.com/56565204/68066277-67cd2800-fcfb-11e9-9744-c488ffb4208e.png)

<hr>

Si llegaste aquí, Felicidades - lograste los objetivos!!

![d2zdiy7-5b4587d4-3ccd-4854-9ed9-5df10f56593f](https://user-images.githubusercontent.com/56565204/67228451-e625f200-f3fe-11e9-99ce-ad733b945ebd.png)

<details>
	<summary>Solucion</summary>
	<p> 1. Agrega un documento de texto con los datos de los Alumnos a registrar.
	<p> 2. Utiliza el método <b>registraAlumno</b> para leer el documento, crear instancias de tipo <b>Alumno</b> y agregarlos a un <b>ArrayList</b>. </p>
	<p> 3. Imprime el <b>ArrayList</b></p>
	<p> 4. Ejecuta el proyecto</p>
</details> 

<hr>

Felicidades, ¡Lograste los objetivos!
