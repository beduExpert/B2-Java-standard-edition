 
 `Java SE`> `Sentencias Control, Scanner, Arreglos` > `Sesión 04` > `Reto 01`

## Reto 1 - Supermercado, Scanner & Arreglos

### OBJETIVO

- El alumno será capaz de solicitar al usuario ingresar vía teclado información al programa.

<hr>

#### REQUISITOS

1. Contar con el proyecto Supermercado modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación clase princiipal

1. Abre la clase <b>SupermercadoTest</b>, elimina o comenta las líneas que están dentro del método main.

2. Dentro del <b>main</b>, declara una instancia de tipo <b>Scanner</b>.

		Scanner s = new Scanner(System.in);
		
   Nota: Esta línea generará un error, se resuelve en el siguiente punto.
    
3. En la <b>línea 1</b> de tu código, agrega la siguiente línea: <b>import java.util.*;</b>

   Nota: Con esta línea, indicamos en que <b>paquete del API</b>, se encuentra la clase Scanner.

4. Imprime una línea que de la bienvenida al registro de usuarios. 
    
5.  El objetivo de los siguientes puntos es solicitar cada uno de los datos necesarios para registrar a un usuario:
  
    <ul>
      <li> Nombre Usuario - Tipo Dato:String
      <li> Fecha cumpleaños - Tipo Dato:String
      <li> Dirección - Tipo Dato: String
      <li> Teléfono - Tipo Dato: String
    </ul>
    
    Inciemos con: <b>Nombre Usuario</b>
    
6. Imprime una línea que solicite al usuario ingresar el <b>nombre del socio</b> a registrar. Es decir:

		System.out.print("Ingresa el nombre del usuario nuevo: ");

7. Declara una variable de tipo <b>String</b>, a la cual le asignarás el valor leído desde el teclado. Utiliza el método        next() de la clase Scanner para llevar a cabo la lectura. Es decir:

		String nombre = input.next();
        
8. Repite el proceso del punto <b>5 y 6</b>, por cada dato necesario para registrar a un usuario, no olvides utilizar el método correcto de la clase Scanner, según el tipo de dato que vas a leer. Para mayor referencia respecto a los datos faltantes, consulta el <b>punto 5</b>.

9. Utiliza la siguiente instrucción para cerrar el objeto de tipo Scanner.

		input.close();

10. Una vez que se cuenta con todos los datos para registrar al usuario en variables <b>locales</b> al <b>main</b>, crear una nueva instancia de tipo Socio.

		Usuario u1 = new Usuario();

11. Incializa o asigna los valores leídos desde el teclado a la variables de instancia del objeto Socio acabado de crear. Es     decir:

		u1.nombre=nombre;
		u1.fechaCumpleaños=fechaCumpleaños;
		u1.direccion=direccion;
		u1.telefono=telefono

12. Recuerda: 

     En la problemática te indicaron que el <b>id</b> del usuario se compone del <b>nombre y primer letra del apellido            paterno</b> del usuario. Calcula este valor y asignalo a la variable de instancia id del usuario que estas creando.
     
     Pista: Utiliza el método substring(..) y charAt(..) para generar este valor.
	
13. Imprime el siguiente mensaje: "Éxito al registrar usuario con el id: "
    
		System.out.println("Exito al registrar usuario con el id: " + u1.id );

13. Ejecuta el proyecto:


<hr>

##### Las reglas cambian

1. El cliente te ha mencionado que olvidó solicitar la edad del Socio. Es importante ya que, si es menor de edad, se le        negará el registro.

2. Agrega la variable de instancia edad a la clase Socio, modifica el código creado en el punto anterior para solicitar y        validar la edad. En caso de que no se cumpla con la edad mínima, no deberás continuar con el registro del Socio.

		System.out.println("Ingresa tu edad: ");
		int edad = input.nextInt();
		if(edad < 18) {
			System.out.println("Edad mínima para registrarse: 18");
			System.out.println("Solicitud rechazada...");
			input.close();
			return; //return, retorna el flujo de ejecución.
		}
		
13. Ejecuta el proyecto:

![Console](https://user-images.githubusercontent.com/56565204/67609390-18628700-f752-11e9-9d25-3f5746d34a96.png)

7. Felicidades, ¡Lograste los objetivos!
