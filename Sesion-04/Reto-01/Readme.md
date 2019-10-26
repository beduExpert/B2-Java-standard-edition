 
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
    
    Iniciemos con: <b>Nombre Usuario</b>
    
6. Imprime una línea que solicite al usuario ingresar el <b>nombre del socio</b> a registrar. Es decir:

		System.out.print("Ingresa el nombre del usuario nuevo: ");

7. Declara una variable de tipo <b>String</b>, a la cual le asignarás el valor leído desde el teclado. Utiliza el método        next() de la clase Scanner para llevar a cabo la lectura. Es decir:

		String nombre = input.nextLine();
   
   Nota: Para leer y obtenre un String con espacios en blanco desde el teclado, utilizar el método <b>nextLine()</b> de              Scanner.
   
8. Repite el proceso del punto <b>5 y 6</b>, por cada dato necesario para registrar a un usuario, no olvides utilizar el método correcto de la clase Scanner, según el tipo de dato que vas a leer. Para mayor referencia respecto a los datos faltantes, consulta el <b>punto 5</b>.

9. Al término del uso del objeto de tipo Scanner, ciérralo.

10. Una vez que se cuenta con todos los datos para registrar al usuario en variables <b>locales</b> al <b>main</b>, crear una nueva instancia de tipo Usuario.

		Usuario u1 = new Usuario();

11. Incializa o asigna los valores leídos desde el teclado a la variables de instancia del objeto Socio acabado de crear.

		u1.nombre=nombre;
		u1.fechaCumpleaños=fechaCumpleaños;
		u1.direccion=direccion;
		u1.telefono=telefono;

12. Recuerda: 

    En la problemática te indicaron que el <b>usuario</b> de este objeto, se compone del <b>nombre y primer letra del           apellido paterno</b> del usuario. Calcula este valor y asignalo a la variable de instancia usaurio del objeto que recién     creaste.
     
     Pista: Utiliza el método substring(..) y charAt(..) para generar este valor.
	
13. Imprime el siguiente mensaje: "Éxito al registrar usuario: "
    
		System.out.println("Exito al registrar usuario: " + u1.usuario );

13. Ejecuta el proyecto:

![Console](https://user-images.githubusercontent.com/56565204/67612154-b3189100-f765-11e9-8a69-d23d0bdfc6dc.png)

<hr>

##### Modificando clase Pedido

1. Abre la clase Pedido, hasta el momento, debes encontrar las propiedades numeroPedido y montoFinal ya agregadas.

2. Agrega una tercer propiedad llamada listaProducto, esta la trabajaremos con un arreglo de objetos de tipo Producto. 

3. El arreglo debe tener un límite de 10 Productos.

<hr>

<details>
	<summary>Solucion</summary>
	<p> 1. Habilita el registro de usuarios, solicitando sus datos vía teclado. </p>
	<p> 2. La propiedad usaurio, se inicializa con el nombre del usario y la primer letra de su apellido paterno.</p>
	<p> 3. En la clase Pedido, declara un arreglo de objetos de tipo Producto, con un tamaño de 10</p>
	<p> Solución:</p> 
	<p> 1. Utiliza Scanner para leer datos el teclado.</b></p>
	<p> 2. Utiliza los métodos substring(.,.) y charAt(.) de la clase String para obtener este dato. </p>
	<p>		<b> int indice1 = u1.nombre.indexOf(' ');</b> </p>
	<p>		<b>u1.usuario = u1.nombre.substring(0,indice1)+u1.nombre.charAt(++indice1);</b> </p>
	<p> 3. Declara un arreglo de objetos de tipo Producto con un tamaño de 10. </p>
	<p>     	<b>public Producto listaProducto[] = new Producto[10];</b>   </p>
</details>
