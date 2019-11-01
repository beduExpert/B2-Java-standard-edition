
`Java SE`> `ArrayList & Exceptions` > `Sesión 07` > `Ejemplo 04`

## Ejemplo 04 - Gimnasio (Parte 2) - Exceptions

### OBJETIVO

- El alumno será capaz de leer de un archivo y manejar la excepciones derivadas de su manipulación.
- El alumno será capaz de crear instancias con las características leídas desde un archivo.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>Gimnasio</b> modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

###### Leyendo de archivo

1. Abre la clase <b>Socio</b>.

   - Declara como variable de clase, un objeto de tipo Path.
   - Este objeto manipulará el <b>archivo.txt</b> que contiene los datos de los socios a registrar.
   
	      private static Path p = Paths.get("archivo.txt"); //Generando objeto de tipo Path para manipular archivo.txt
        
   - No olvides importar del paquete java.nio.file, la clase <b>Path & Paths</b>
   
       	import java.nio.file.Path;
       	import java.nio.file.Paths;


2. Sobreescribe el método <b>toString</b> de la clase Object. Esto con la finalidad de que al imprimir un Objeto de tipo Socio, se imprima nombre, así como numeroSocio,

		public String toString() {
			return getNombre() + " " + getNumeroSocio();
		}
		
3. Ubica el método <b>registroSocio</b>

   - Modifica el tipo de retorno, ahora será un <b>ArrayList</b> de objetos de tipo <b>Socio</b>.
   
   	- Esta modificación permitirá retornar todos los Socios dados de alta desde el archivo de texto.
	
   - Ubica la línea donde se imprime el mensaje <b>Bienvenido al registro de socios: </b>
   - Justo en la línea de abajo, declara un  <b>ArrayList</b> de objetos de tipo <b>Socio</b>.
   - Modifica el Objeto de tipo Scanner para que en lugar de leer del teclado, lea del <b>archivo.txt</b>
   		  
		    Scanner input = new Scanner( new File(p.toString()) );

   - No olvides importar del paquete <b>java.io</b>, la clase <b>File</b>. 
   
        import java.io.File;        
        
3. Agrega el código necesario para controlar la exception de tipo <b>FileNotFoundException</b> en la línea habilitada en el punto anterior.

    		try {
			    Scanner input = new Scanner( new File(p.toString()) );
		    }catch(FileNotFoundException e) {
			    System.out.println("Archivo no encontrado...");
		    }
        
    - No olvides importar del paquete <b>java.io</b>, la clase <b>FileNotFoundException</b>.
    
        import java.io.FileNotFoundException;
                
4. Elimina todas las líneas donde se imprimie un mensaje solicitando la información al usuario.
                        
5. El resto de código que lee y valida los datos para crear la instancia de tipo Socio, muévelo a bloque de código del try.
   
   Nota: 
   
   - Observa que las líneas donde se utilizaba el statment return para retornar un null o el objeto det tipo Socio recién creados, ya no se encuentran.
   
   - Han sido substituidas por:
   
   	1.- socios.add(s) - Invocación del método add del ArrayList para agregar a la colección el objeto recién creado.
	2.- return socios - Retorna colección de Objetos de tipo Socio recién creados a partir de los datos leídos en archivo.

       public static ArrayList<Socio> registroSocio(){
		/************************* Registro Socio ****************************/		
		System.out.println("************* Bienvenido al registro de socios: *************");
		ArrayList<Socio> socios = new ArrayList<Socio>();
		try {
			Scanner input = new Scanner(new File(p.toString()));
			while( input.hasNext() ) {
				String nombre = input.next();
				int numeroSocio = input.nextInt();
				String correoElectronico = input.next();
				String telefono=input.next();
				int edad = input.nextInt();
				if(edad < 18) {
					System.out.println("************************************************************");
					System.out.println("Problema - Solicitud rechazada...");
					System.out.println("Error, edad mínima para registrarse: 18");
					input.close();
				}
				Socio s = new Socio(nombre, numeroSocio, correoElectronico, telefono, edad);				
				System.out.println("Éxito al registrar socio número: " + s.getNumeroSocio());
				socios.add(s);
				System.out.println("************************************************************");			
			}
		}catch(FileNotFoundException f) {
			System.out.println("Archivo no encontrado...");
		}
		return socios;
	}
 
###### Modificando clase GimnasioTest 

1. Modifica la línea donde se invoca el método <b>registroSocio</b> de la clase <b>Socio</b>, ahora lo que obtendremos al ejecutarlo, es un <b>ArrayList</b> de objetos de tipo <b>Socio</b>.

		ArrayList<Socio> lista = Socio.registroSocio(); 
		
2. Imprime la lista de Socios recién registrados.

		System.out.println(lista);

![Console](https://user-images.githubusercontent.com/56565204/67833093-470d9400-faa9-11e9-82cf-978789b99f3f.png)

<hr>

Felicidades, ¡Lograste los objetivos!