 
`Java SE`> `ArrayList & Exceptions / Paquetes` > `Sesión 07` > `Proyecto-Parte1`

## UniversidadMexico (Parte 1) - ArrayList

### OBJETIVO

- El Alumno será capaz de declarar y manipular un ArrayList.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>UniversidadMexico</b> trabajado en el la sesión anterior.

<hr>

#### DESARROLLO
   
###### Implementando ArrayList

1. Abre la clase <b>Alumno</b>.
2. Ubica la línea donde declaraste un arreglo de objetos de tipo <b>Libro</b>.

   - Modifica esta línea:
   	- En lugar de un arreglo, habilita un <b>ArrayList</b>.
	
				private ArrayList<Libro> listaLibros = new ArrayList<Libro>();

   	- No olvides importar del paquete <b>java.util</b>, la clase <b>ArrayList</b>. ( Siempre en las líneas superiores a la declaración de la clase. )
	
				import java.util.ArrayList;
              
3. Ubica el método <b>getListaLibros</b>.

   - Este método te permite obtener el <b>arreglo de objetos de tipo Libro</b> que antes teníamos habilitado.
   - Modifica el código para que ahora retorne un <b>ArrayList</b> de objetos de tipo <b>Libro</b>.
                
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

![Console](https://user-images.githubusercontent.com/56565204/68262144-ff868b00-0007-11ea-91a3-04b0bb733a57.png)

Si llegaste aquí, Felicidades - lograste los objetivos!!

![d2zdiy7-5b4587d4-3ccd-4854-9ed9-5df10f56593f](https://user-images.githubusercontent.com/56565204/67228451-e625f200-f3fe-11e9-99ce-ad733b945ebd.png)

<details>
	<summary>Solucion</summary>
	<p> 1. Cambiar de <b>arreglo</b> de objetos de tipo <b>Libro</b> a <b>ArrayList</b>.
	<p> 2. Modificación método <b>getListaLibros</b>, manipulación de un <b>ArrayList de tipo Libro</b> </p>
	<p> 3. Modificación método <b>addLibro</b>, manipulación de un <b>ArrayList de tipo Libro</b></p>
	<p> 4. Ejecuta el proyecto</p>
</details> 

<hr>

Felicidades, ¡Lograste los objetivos!
