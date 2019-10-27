
`Java SE`> `Diseño Clase` > `Sesión 05` > `Ejemplo 02`

## Ejemplo 2 - Gimnasio, Encapsulación

### OBJETIVO

- El alumno será capaz de aplicar encapsulación en las clases previamente declaradas.

<hr>

#### REQUISITOS

1. Contar con el proyecto Gimnasio modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

1. Abre la clase <b>Socio</b>.
2. Encapsula correctametne la clase - cambia el modificador de acceso de <b>public a private</b>.
	
        private String nombre;            //nombre
        private int numeroSocio;          //numeroSocio
        private String correoElectronico; //correoElectronico
        private String telefono;          //telefono
        private int edad;	          //edad
        		                         
3. Declara los métodos <b>get</b> y <b>set</b> para cada propiedad encapsulada.

        public String getNombre(){
                return nombre;
        }
        
        public void setNombre(String nombre) {
		this.nombre=nombre;
        }
        
        public int getNumeroSocio(){
		return numeroSocio;
        }
        
        public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio=numeroSocio;
        }
        
        ... Agrega el código para el resto de propiedades
        
4. Abre la clase <b>Actividad</b>. 
    
5. Coloca el mouse justo después de la última propiedad declarada en la clase.
6. Con click derecho, selecciona el menú <b>Source</b>, para después seleccionar la opción <b>Generate Getters and Setters</b>, por último selecciona las propiedades a las que les generarás métodos get y set.

##### Editando clase principal

1. Abre la clase principal, observa que hay algunos errores en el código. Corresponden a las líneas donde se modificaban las propiedades del objeto Socio de forma directa. (Ahora es imposible acceder a las características si no es vía la interfaz pública, <b>get & set</b>).

2. Modifica las líneas con error para utlizar los métodos set's para asignar valores y get's para obtener valores del objeto Socio.

		Socio s1 = new Socio();
		s1.setNombre(nombre);
		s1.setNumeroSocio(numeroSocio);
		s1.setCorreoElectronico(correoElectronico);
		s1.setTelefono(telefono);
		
		System.out.println("Exito al registrar socio número: " + s1.getNumeroSocio() );

13. Ejecuta el proyecto:

![Console](https://user-images.githubusercontent.com/56565204/67607717-134e0980-f74b-11e9-8926-ccd47a426532.png)

<hr>

14. Felicidades, ¡Lograste los objetivos!
