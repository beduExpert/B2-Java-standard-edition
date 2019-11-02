 
`Java SE`> `ArrayList & Excpetions` > `Sesión 07` > `Reto 03`

## Reto 02 -  Gimnasio (Parte 1) - ArrayList

### OBJETIVO

- El Alumno será capaz de declarar y manipular un ArrayList.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>Gimnasio</b> trabajado en el la sesión anterior.

<hr>

#### DESARROLLO
   
###### Implementando ArrayList

1. Abre la clase <b>Alumno</b>.
2. Ubica la línea donde declaraste un arreglo de objetos de tipo <b>Libro</b>.

   - Modifica esta línea, en lugar de un arreglo, habilita un ArrayList.
   
	     private ArrayList<Libro> listaLibros = new ArrayList<Libro>();

   - No olvides importar del paquete java.util, la clase ArrayList. ( Siempre en las líneas superirores a la declaración de la clase. )
   
                import java.util.*;        
        
3. Ubica el método <b>getListaLibros</b>.

   - Este método te permite obtener el arreglo de objetos de tipo Libro que antes teníamos habilitado.
   - Modifica el código para que ahora retorne un <b>ArrayList<b> de objetos de tipo <b>Libro</b>.
   
               	public ArrayList<Libro> getListaLibros() {
			return listaLibros;
			}
                
4. Ubica el método <b>addLibro</b>.

   - Este método te permite agregar una nuevo <b>Libro</b>, al arreglo de objetos de tipo <b>Libro</b> que antes teníamos habilitado.
   - Comenta este código y genera uno nuevo que permita agregar objetos de tipo <b>Libro</b> al ArrayList recién habilitado.
   - Al final compara el código nuevo con el viejo.
   
               public void addLibro(Libro nuevo) {
		 if( listaLibros.size() == MAX_LIBROS) {
			 System.out.println("No puedes solicitar más libros...");
		 }else {
			 listaLibros.add(nuevo);
			 System.out.println("Libro agregado...");
		 }		 
	 	}
                        
5. Al comparar el código viejo y el nuevo, te podrás dar cuenta que ya no necesitamos un índice para controlar el arreglo de objetos de tipo Libro, esta "administración" del ArrayList, se hace en automático.

   - Elimina la variable <b>libroActual</b> que utilizabamos para este propósito.
 
 6. Modifica cualquier otro punto de código que se viera afectado con los cambios antes realizados.
 
 7. Ejecuta el proyecto.
  


<hr>

Felicidades, ¡Lograste los objetivos!
