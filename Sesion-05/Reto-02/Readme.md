 
 `Java SE`> `Diseño Clase` > `Sesión 05` > `Reto 02`

## Reto 02 - Supermercado, Método Static

### OBJETIVO

- El alumno será capaz de declarar e invocar un método static.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>Supermercado</b> modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

1. Abre la clase <b>Usuario</b>.
2. Declara el método registroUsuario, requisitos:

   <ul>
        <li> Modficadores de acceso: public, static
        <li> Tipo de retorno: Usuario
        <li> Nombre: registroUsuario
        <li> Lista argumentos: Sin contenido
   </ul>
           		                        
3. Abre la clase <b>SupermercadoTest</b>
   
   Mueve el código que permite registrar un <b>Usuario</b>, al método recién creado en la clase <b>Usuario</b> llamado <b>registroSocio</b>
   
4. Algunos cambios en el código:

   Busca las líneas: 

   		System.out.println("Éxito al registrar el usuario: " + u1.getUsuario());
		System.out.println("*************************************************");
   
   Justo después de esa línea, agrega:
   
        return u1;
        
        Nota: 
        - En la variable u1 guardamos el objeto de tipo Usuario creado en líneas anteriores.
        - Al utilizar return, estamos enviando el objeto al bloque de código donde se invoco el método. (main)
   
        
##### Editando clase principal

1. Edita el método main, agrega el siguiente código:

	        Usuario s = Usuario.registroSocio();

   Nota: 
        - Estamos invocando el método registroSocio (estático), econtrado en la clase Usuario. 
        - Retorna la instancia de tipo Usuario creada.

![Console](https://user-images.githubusercontent.com/56565204/67644097-e6812a00-f8e3-11e9-8a57-64d333ad7c81.png)

<hr>

2. Felicidades, ¡Lograste los objetivos!
