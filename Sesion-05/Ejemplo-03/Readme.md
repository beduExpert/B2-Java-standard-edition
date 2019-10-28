
`Java SE`> `Diseño Clase` > `Sesión 05` > `Ejemplo 03`

## Ejemplo 03 - Gimnasio, Método Static

### OBJETIVO

- El alumno será capaz de declarar e invocar un método static.

<hr>

#### REQUISITOS

1. Contar con el proyecto Gimnasio modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

1. Abre la clase <b>Socio</b>.
2. Declara el método registroSocio, requisitos:

   <ul>
        <li> Modficadores de acceso: public, static
        <li> Tipo de retorno: Socio
        <li> Nombre: registroSocio
        <li> Lista argumentos: Sin contenido
   </ul>
   
        public static Socio registroSocio(){
        }
           		                        
3. Abre la clase <b>GimnasioTest</b>
   
   Mueve el código que permite registrar un <b>Socio</b> al método recién creado en la clase <b>Socio</b> llamado <b>registroSocio</b>
   
4. Algunos cambios en el código:

   Busca la línea: 
   
   	//return;	
   
   Modifícala: 
   	
        return null;
   
        Nota: Este cambio lo hacemos debido a que el  método tiene un tipo de retorno de tipo: Socio, en caso de que no se                 pueda crear el Socio ( edad mínima ), retornara null, es decir, ningún objeto.
        
5. Seguimos con los cambios:

   Busca la línea: 

        System.out.println("Éxito al registrar socio número: " + s1.getNumeroSocio());
   
   Justo después de esa línea, agrega:
   
        return s1;
        
        Nota: 
        - En la variable s1 guardamos el objeto de tipo Socio creado en líneas anteriores.
        - Al utilizar return, estamos enviando el objeto al bloque de código donde se invoco el método. (main)
        
   Si tienes algún problema, este es el código:
   
   	public static Socio registroSocio(){
		/************************* Registro Socio ****************************/
		Scanner input = new Scanner(System.in);
		System.out.println("************* Bienvenido al registro de socios: *************");
		System.out.print("Ingresa el nombre del socio nuevo: ");
		String nombre = input.next();
		System.out.print("Ingresa el número de socio: ");
		int numeroSocio = input.nextInt();
		System.out.print("Ingresa el correo electrónico de socio: ");
		String correoElectronico = input.next();
		System.out.print("Ingresa el teléfono del socio: ");
		String telefono=input.next();	
		System.out.print("Ingresa tu edad: ");
		int edad = input.nextInt();
		if(edad < 18) {
			System.out.println("************************************************************");
			System.out.println("Problema - Solicitud rechazada...");
			System.out.println("Error, edad mínima para registrarse: 18");
			input.close();
			//return;	
			return null; //Cambio debido al tipo de retorno del método.
		}
		input.close();
		
		Socio s1 = new Socio();
		s1.setNombre(nombre);
		s1.setNumeroSocio(numeroSocio);
		s1.setCorreoElectronico(correoElectronico);
		s1.setTelefono(telefono);		
		System.out.println("Éxito al registrar socio número: " + s1.getNumeroSocio());
		
		return s1;			
                }
        
##### Editando clase principal

1. Edita el método main, agrega el siguiente código:

	        Socio s = Socio.registroSocio();

   Nota: 
        - Estamos invocando el método registroSocio (estático), econtrado en la clase Socio. 
        - Retorna la instancia de tipo Socio creada en caso de ser exitosa la creación.

![Console](https://user-images.githubusercontent.com/56565204/67607717-134e0980-f74b-11e9-8926-ccd47a426532.png)

<hr>

14. Felicidades, ¡Lograste los objetivos!
