
`Java SE`> `Sentencias Control, Scanner, Arreglos` > `Sesión 04` > `Ejemplo 06`

## Ejemplo 3 - Gimnasio, Scanner

### OBJETIVO

- El alumno será capaz de solicitar al usuario ingresar vía teclado información al programa.

<hr>

#### REQUISITOS

1. Contar con el proyecto Gimnasio modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación clase princiipal

1. Abre la clase <b>GimnasioTest>, elimina las líneas que están dentro del método main.
2. Dentro del <b>main</b>, declara una instancia de tipo Scanner.
  
    Scanner input = new Scanner(System.in);
    
   Nota: Esta línea te generará un erro, se resuelve en el siguiente punto.
    
3. En la línea 1 de tu código, agrega la siguiente línea: import java.util.* 

  Nota: Con esta línea, indicamos en que paquete del API, se encuentra la clase Scanner.

4. Imprime una línea que de la bienvenida al registro de socios.

  El objetivo de los siguientes puntos es solicitar cada uno de los datos necesarios para registrar a un usuario:
  
    <ul>
      <li> Nombre Usuario - Tipo:String
      <li> Número Socio - Tipo:int
      <li> Correo Electronico - Tipo String
      <li> Teléfono - Tipo String
    </ul>
    
5. Imprime una línea que solicite al usuario ingresar el nombre del socio a registrar.
6. Declara una variable de tipo String, a la cual le asignarás el valor leído desde el teclado, utiliza el método next(), de    la clase Scanner. Es decir:

    String nombre = input.next();
        
7. Repite el proceso del punto 5 y 6, por cada dato necesario para registrar a un socio, no olvides utilizar el método          correcto de la clase Scanner, según el tipo de dato que vas a leer. 
8. Una vez que se cuenta con todos los datos para registrar al usuario en variables <b>locales</b> al <b>main</b>, crear una    nueva instancia de tipo Socio.

    Socio s1 = new Socio();
    
9. Incializa o asigna los valores leídos desde el teclado a la variables de instancia del objeto Socio acabado de crear. Es      decir:

		s1.nombre=nombre;
		s1.numeroSocio=numeroSocio;
		s1.correoElectronico=correoElectronico;
		s1.telefono=telefono;
    
10. Imprime el siguiente mensaje: "Éxito al registrar socio número: "
    Concatena a este mensaje el número de socio recien registrado, es decir:
    
    System.out.println("Exito al registrar socio número: " + s1.numeroSocio );

<hr>
##### Ejecutando proyecto

1. Ejecuta el proyecto:


7. Felicidades, ¡Lograste los objetivos!
