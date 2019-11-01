
`Java SE`> `ArrayList & Exceptions` > `Sesión 07` > `Ejemplo 03`

## Ejemplo 03 - Gimnasio, ArrayList & Exceptions

### OBJETIVO

- El alumno será capaz de implementar un ArrayList & manejar Exceptions.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>Gimnasio</b> modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

###### Implementando ArrayList

1. Abre la clase <b>Socio</b>.
2. Ubica la línea donde declaraste un arreglo de objetos de tipo Actividad.

   - Modifica esta línea, en lugar de un arreglo, habilita un ArrayList.
   
           	private ArrayList<Actividad> actividades = new ArrayList<Actividad>();

   - No olvides importar del paquete java.util, la clase ArrayList. ( Siempre en las líneas superirores a la declaración de la clase )
   
                import java.util.*;        
        
3. Ubica el método <b>getActividades</b>.

   - Este método te permite obtener el arreglo de objetos de tipo Actividad que antes teníamos habilitado.
   - Modifica el código para que ahora retorne un ArrayList de objetos de tipo Actividad.
   
                public ArrayList<Actividad> getActividades() {
		        return actividades;
	        }
                
4. Ubica el método <b>addActividad</b>.

   - Este método te permite agregar una nueva Actividad, al arreglo de objetos de tipo Actividad que antes teníamos habilitado.
   - Comenta este código y genera uno nuevo que permita agregar objetos de tipo Actividad al ArrayList recién habilitado.
   - Al final compara el código nuevo con el viejo.
   
                        if(actividades.size()==maxActividades) {
		       	        System.out.println("No tienes derecho a más actividades...");
		        }else {
			        actividades.add(nueva);
			        System.out.println("Actividad agregada... " + nueva);
		        }
                        
5. Al comparar el código viejo y el nuevo, te podrás dar cuenta que ya no necesitamos un índice para controlar el arreglo de objetos de tipo Actividad, esta "administración" del ArrayList, se hace en automático.

   - Elimina la variable <b>numActiviad</b> que utilizabamos para este propósito.
 
 6. Ejecuta el proyecto.
  
![Console](https://user-images.githubusercontent.com/56565204/67833093-470d9400-faa9-11e9-82cf-978789b99f3f.png)

<hr>

Felicidades, ¡Lograste los objetivos!
