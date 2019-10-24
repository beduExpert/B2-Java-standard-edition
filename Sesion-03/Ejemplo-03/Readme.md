
`Java SE`> `¿Qué es Java` > `Sesión 02` > `Ejemplo 03`

## Ejemplo 3 - Gimnasio, Variables Instancia

### OBJETIVO

- El alumno será capaz de declarar variables de instancia.

<hr>

#### REQUISITOS

1. Contar con el proyecto Gimnasio modificado en la última sesión.
2. Abrir el proyecto en Eclipse.
3. Contar con mínimo la clase <b>Actividad & Socio</b> ya declaradas en el proyecto.

<hr>

#### DESARROLLO

##### Declarando variables de instancia de la clase Actividad.

1. Abre la clase Actividad, actualmente tiene las propiedades y comportamientos declarados con comentarios.
2. Edita la clase, declara las variables de instancia, recuerda que estas corresponden a las propiedades del objeto.

![Proyecto](https://user-images.githubusercontent.com/56565204/67443334-ff2ece80-f5c9-11e9-8033-785edca89bb6.png)

##### Declarando variables de instancia de la clase Socio.

1. Abre la clase Socio, actualmente tiene las propiedades y comportamientos declarados con comentarios.
2. Edita la clase, declara las variables de instancia, recuerda que estas corresponden a las propiedades del objeto.

![Proyecto](https://user-images.githubusercontent.com/56565204/67443454-9136d700-f5ca-11e9-82b0-378ebffbbb91.png)

##### Modificando clase principal.

1. Abre la clase principal, en el método <b>main</b>, deben de esar declaradas algunas instancias.
2. Ubica la línea donde se declaró la instancia de tipo Socio.
3. Debajo de ella, asignale valores a cada variable de instancia del objeto Socio ya declarado. Ejemplo:

        Socio s = new Socio(); //Nota, esta línea ya se encuentra declarada, no es neceario volver a declararla.
        s.nombre="Porfirio";
        s.numeroSocio=33;
        s.correoElectronico="porfiriod@gmail.com";
        s.telefono="333-22-22";
        
4. Elimina el mensaje: "Terminando de crear instancias".
5. Declara una línea donde imprimas los datos del socio. Toma como referencia la siguiente imagen:

![Proyecto](https://user-images.githubusercontent.com/56565204/67443905-651c5580-f5cc-11e9-96bb-1e2eed668e88.png)

6. Ejecuta el proyecto:

![Console](https://user-images.githubusercontent.com/56565204/67444010-dc51e980-f5cc-11e9-9a6a-3756690a2dc0.png)
