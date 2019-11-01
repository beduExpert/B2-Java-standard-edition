
`Java SE`> `ArrayList & Exceptions` > `Sesión 07` > `Ejemplo 04`

## Ejemplo 04 - Gimnasio (Parte 2) - ArrayList

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


2. Ubica el método <b>registroSocio</b>

   - Ubica la línea donde se declaró el Objeto de tipo <b>Scanner</b>
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
                
4. Elimina todas las líneas donde se solicitaba información al usuario.
                        
5. El resto de código que lee y valida los datos para crear la instancia de tipo Socio, muévelo a bloque de código del try.

       try {
		  	Scanner input = new Scanner( new File(p.toString()) );
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
				  return null; //Cambio debido al tipo de retorno del método.
			  }
			  input.close();
			  Socio s1 = new Socio(nombre, numeroSocio, correoElectronico, telefono, edad);				
			  System.out.println("Éxito al registrar socio número: " + s1.getNumeroSocio());
			  System.out.println("************************************************************");			
			  return s1;			
		  }catch(FileNotFoundException e) {
			  System.out.println("Archivo no encontrado...");
			  return null;
		  }	
 
 6. Ejecuta el proyecto, ¿Cuántas instancias de tipo Socio se han creado?
 
###### Modificando 

1.
![Console](https://user-images.githubusercontent.com/56565204/67833093-470d9400-faa9-11e9-82cf-978789b99f3f.png)

<hr>

Felicidades, ¡Lograste los objetivos!
