
`Java SE`> `Sentencias Control, Scanner, Arreglos` > `Sesión 04` > `Ejemplo 06`

## Ejemplo 6 - Gimnasio, Scanner

### OBJETIVO

- El alumno será capaz de solicitar al usuario ingresar vía teclado información al programa.

<hr>

#### REQUISITOS

1. Contar con el proyecto Gimnasio modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación clase princiipal

1. Abre la clase <b>GimnasioTest</b>, elimina las líneas que están dentro del método main.
2. Dentro del <b>main</b>, declara una instancia de tipo Scanner.

   Scanner input = new Scanner(System.in);
    
   Nota: Esta línea generará un error, se resuelve en el siguiente punto.
    
3. En la <b>línea 1</b> de tu código, agrega la siguiente línea: <b>import java.util.*;</b>

   Nota: Con esta línea, indicamos en que paquete del API, se encuentra la clase Scanner.

4. Imprime una línea que de la bienvenida al registro de socios. 
    
5.  El objetivo de los siguientes puntos es solicitar cada uno de los datos necesarios para registrar a un usuario:
  
    <ul>
      <li> Nombre Socio - Tipo Dato:String
      <li> Número Socio - Tipo Dato:int
      <li> Correo Electronico - Tipo Dato: String
      <li> Teléfono - Tipo Dato: String
    </ul>
    
    Comencemos con: Nombre Socio
    
6. Imprime una línea que solicite al usuario ingresar el <b>nombre del socio</b> a registrar.
7. Declara una variable de tipo <b>String</b>, a la cual le asignarás el valor leído desde el teclado. Utiliza el método        next() de la clase Scanner para llevar a cabo la lectura. Es decir:

    String nombre = input.next();
        
8. Repite el proceso del punto <b>5 y 6</b>, por cada dato necesario para registrar a un socio, no olvides utilizar el método    correcto de la clase Scanner, según el tipo de dato que vas a leer. Para mayor referencia respecto a los datos faltantes,    consulta el <b>punto 5</b>.

9. Utiliza la siguiente instrucción para cerrar el objeto de tipo Scanner.

	input.close();
	
10. Una vez que se cuenta con todos los datos para registrar al usuario en variables <b>locales</b> al <b>main</b>, crear una    nueva instancia de tipo Socio.

    Socio s1 = new Socio();
    
11. Incializa o asigna los valores leídos desde el teclado a la variables de instancia del objeto Socio acabado de crear. Es      decir:

		s1.nombre=nombre;
		s1.numeroSocio=numeroSocio;
		s1.correoElectronico=correoElectronico;
		s1.telefono=telefono;
    
12. Imprime el siguiente mensaje: "Éxito al registrar socio número: "
    Concatena a este mensaje el número de socio recien registrado, es decir:
    
    System.out.println("Exito al registrar socio número: " + s1.numeroSocio );

<hr>

##### Ejecutando proyecto

1. Ejecuta el proyecto:

![Console](https://user-images.githubusercontent.com/56565204/67607717-134e0980-f74b-11e9-8926-ccd47a426532.png)

7. Felicidades, ¡Lograste los objetivos!
