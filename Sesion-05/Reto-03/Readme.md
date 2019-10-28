
`Java SE`> `Diseño Clase` > `Sesión 05` > `Reto 03`

## Ejemplo 03 - Supermercado, Constructor

### OBJETIVO

- El alumno será capaz de declarar e invocar un constructor.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>Supermercado</b> modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

1. Abre la clase <b>Usuario</b>.
2. Justo después de la última línea de declaración de variables de instancia de la clase, declara el siguiente constructor:

		public Usuario(String nombre, String fechaCumpleaños, String direccion, String telefono) {
			this.nombre=nombre;
			this.fechaCumpleaños=fechaCumpleaños;
			this.direccion=direccion;
			this.telefono=telefono;
		}
		
   Como buena práctica, es recomendable declarar siempre el constructor default, decláralo:
   
   		public Usuario() {
		
		}
   
3. Invocando constructor.

   Busca las líneas donde declaraste la instancia de tipo Usuario, también ubica las líneas donde asignaste valores a las variables de instancia. Es decir:
   
  		Usuario u1 = new Usuario();
		u1.setNombre(nombre);
		u1.setFechaCumpleaños(fechaCumpleaños);
		u1.setDireccion(direccion);
		u1.setTelefono(telefono);	
   
   Elimina este código.
   
4. En donde fue eliminado el código, declara una instancia de tipo Socio utilizando el constructor recien creado. Es decir:

		Usuario u1 = new Usuario(nombre, fechaCumpleaños, direccion, telefono);				

5. Ejecuta el código.

![Console](https://user-images.githubusercontent.com/56565204/67644097-e6812a00-f8e3-11e9-8a57-64d333ad7c81.png)

<hr>

2. Felicidades, ¡Lograste los objetivos!
