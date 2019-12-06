
`Java SE`> `Diseño Clase` > `Sesión 05` > `Ejemplo 01`

## Ejemplo 01 - Gimnasio, Método Static

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
   
   	return;	
   
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
   
        
##### Editando clase principal

1. Edita el método main, agrega el siguiente código:

	        Socio s = Socio.registroSocio();

   Nota: 
        - Estamos invocando el método registroSocio (estático), econtrado en la clase Socio. 
        - Retorna la instancia de tipo Socio creada en caso de ser exitosa la creación.

![Console](https://user-images.githubusercontent.com/56565204/67607717-134e0980-f74b-11e9-8926-ccd47a426532.png)

<hr>

2. Felicidades, ¡Lograste los objetivos!
