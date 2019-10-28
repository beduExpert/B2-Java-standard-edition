 
`Java SE`> `Diseño Clase` > `Sesión 05` > `Reto 01`

## Reto 01 - Supermercado, Encapsulación

### OBJETIVO

- El alumno será capaz de aplicar encapsulación en las clases previamente declaradas.

<hr>

#### REQUISITOS

1. Contar con el proyecto Supermercado modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

1. Encapsula y genera los métodos get & set de cada clase en el proyecto. ( Pedido, Producto y Usuario )

   Nota: De al menos una clase utiiza el procedimiento manual, el resto puedes hacerlo con las herramientas de eclipse.
   
#### Editando clase principal

1. Abre la clase principal, observa que hay algunos errores en el código. Corresponden a las líneas donde se modificaban las propiedades del objeto Usuario de forma directa. (Ahora es imposible acceder a las características si no es vía la interfaz pública, <b>get & set</b>).

2. Modifica las líneas con error para utlizar los métodos set's para asignar valores y get's para obtener valores del objeto Socio.

		Usuario u1 = new Usuario();
		u1.setNombre(nombre);
		u1.setFechaCumpleaños(fechaCumpleaños);
		u1.setDireccion(direccion);
		u1.setTelefono(telefono);
		/***Calculando id***/
		int indice1 = u1.getNombre().indexOf(' ');
		u1.setUsuario(u1.getNombre().substring(0,indice1)+u1.getNombre().charAt(++indice1));
		
		System.out.println("Exito al registrar el usuario: " + u1.getUsuario());
		
3. Ejecuta el proyecto:

![Console](https://user-images.githubusercontent.com/56565204/67644097-e6812a00-f8e3-11e9-8a57-64d333ad7c81.png)

<hr>

14. Felicidades, ¡Lograste los objetivos!
