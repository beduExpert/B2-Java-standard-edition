
`Java SE`> `Paquetes & Diseño Clases: Clases Abstractas & Interfaces` > `Sesión 08` > `Proyecto-Parte2`

## UniversidadMexico (Parte 2) - Clases Abstractas

### OBJETIVO

- El Alumno será capaz de declarar y manipular Clases Abstractas.

<hr>

#### REQUISITOS

1. Tener instalado Eclipse.
3. Abrir el proyecto <b>UniversidadMexico</b> trabajado anteriormente.

<hr>

#### DESARROLLO
   
###### Creando Clases Abstractas

1. Para poder prestar un libro a un alumno, necesitamos saber que tipo de libro es.
  
   - Corrige el diseño de clases para que esto sea posible.
   - Declara como clase abstracta la clase <b>Libro</b>.
   
2. El método tiempoRetorno, depende del tipo de libro prestado. Por lo tanto, este es un método abstracto.

   - Corrige el diseño de la clase <Libro> para que el método <b>tiempoRetorno</b> sea declarado como abstracto.
   
3. Las clases <b>FilosofiaLibro, FisicaLibro, PoliticaLibro</b> ya deben estar implementando el método <b>tiempoRetorno</b>.

   - Recuerda: Antes estaba implementado por sobreescritura.
   - Ahora esta implementado vía una clase abstracta.

5. Ejecuta el proyecto.

![Console](https://user-images.githubusercontent.com/56565204/67881593-5ff86280-fb06-11e9-84ae-319e67b8146c.png)

Si llegaste aquí, Felicidades - lograste los objetivos!!

![d2zdiy7-5b4587d4-3ccd-4854-9ed9-5df10f56593f](https://user-images.githubusercontent.com/56565204/67228451-e625f200-f3fe-11e9-99ce-ad733b945ebd.png)

<details>
	<summary>Solucion</summary>
	<p> 1. Convertir la clase <b>Libro</b> y su método <b>tiempoRetorno</b> en abstractos.
	<p> 2. Asegurarse de que las <b>Subclases de Libro<b>, esten implementando de forma correcta la clase abstracta.
	<p> 4. Ejecuta el proyecto</p>
</details> 

<hr>

Felicidades, ¡Lograste los objetivos!
