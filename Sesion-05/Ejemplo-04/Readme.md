
`Java SE`> `Diseño Clase` > `Sesión 05` > `Ejemplo 04`

## Ejemplo 04 - Gimnasio, Constructor

### OBJETIVO

- El alumno será capaz de declarar e invocar un constructor.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>Gimnasio</b> modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

1. Abre la clase <b>Socio</b>.
2. Justo después de la última línea de declaración de variables de instancia de la clase, declara el siguiente constructor:

		public Socio( String nombre, int numeroSocio, String correoElectronico, String telefono, int edad) {
      			this.nombre=nombre;
      			this.numeroSocio=numeroSocio;
      			this.correoElectronico=correoElectronico;
      			this.telefono=telefono;
      			this.edad=edad;
      		}
  
3. Invocando constructor.

   Busca las líneas donde declaraste la instancia de tipo Socio, también ubica las líneas donde asignaste valores a las variables de instancia. Es decir:
   
   	  	Socio s1 = new Socio();
		s1.setNombre(nombre);
		s1.setNumeroSocio(numeroSocio);
		s1.setCorreoElectronico(correoElectronico);
		s1.setTelefono(telefono);	
   
   Elimina este código.
   
4. En donde fue eliminado el código, declara una instancia de tipo Socio utilizando el constructor recien creado. Es decir:

		Socio s1 = new Socio(nombre, numeroSocio, correoElectronico, telefono, edad);				

##### Editando clase principal

1. Ejecuta el código.

![Console](https://user-images.githubusercontent.com/56565204/67607717-134e0980-f74b-11e9-8926-ccd47a426532.png)

<hr>

2. Felicidades, ¡Lograste los objetivos!
