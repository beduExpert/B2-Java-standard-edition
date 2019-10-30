
`Java SE`> `Herencia & Polimorfismo` > `Sesión 06` > `Ejemplo 04`

## Ejemplo 04 - Gimnasio, Herencia & Polimorfismo

### OBJETIVO

- El alumno será capaz de implementar Herencia y Polimorfismo.

<hr>

#### REQUISITOS

1. Contar con el proyecto <b>Gimnasio</b> modificado en la última sesión.
2. Abrir el proyecto en Eclipse.

<hr>

#### DESARROLLO

##### Modificación de clases

###### Implementando Herencia & Sobreescritura

1. Abre la clase <b>Actividad</b>.
2. Declara el método ejecutaActividad:

        public void ejecutarActividad() {
		      System.out.println("General...");
	      }
        
3. Declara la clase <b>Yoga</b> como Subclase de Actividad.
4. En la misma clase <b>Yoga</b>, sobreescribe el método ejecutarActividad, declara en el una línea que imprima el mensaje: Yoga time...

        public class Yoga extends Actividad {
	        public void ejecutarActividad() {
		      System.out.println("Yoga time...");
	      }

4. Repite el punto 3 y 4, para la creación de la declaración de las clases: <b>Pilates</b>, <b>Trx</b> y <b>Zumba</b>	

   Nota: En la sobreescritura del método ejecutarActividad, no olvides colocar un mensaje distinto en cada Subclase.

5. Abre la clase <b>Socio</b>. 

   El objetivo de este punto es crear una propiedad en la clase <b>Socio</b> que permita manipular la lista de actividades a las que un <b>Socio</b> esta inscrito.

   - Declara una variable de instancia llamada <b>maxActividades</b>, características:
   
      - Tipo Dato: <b>int</b>, Valor: <b>3</b>
      - Nota: Esta variable tiene la cantidad máxima de actividades que un Socio puede registrar.
      
      	    private int maxActividades=3; 	  //máximo actividades
     
   - Declara una variable de instancia llamada <b>actividades</b>, características:
   
      - Tipo Dato: <b>Arreglo</b> de objetos de tipo <b>Actividad</b>
      - Valor: Un <b>Arreglo</b> de objetos de tipo <b>Actividad</b>, <b>tamaño: maxActividades</b>.
      
            private Actividad[] actividades=new Actividad[maxActividades];
            
   - Declara el método get correspondiente a la variable de instancia <b>actividades</b>
   
          public Actividad[] getActividades() {
		        return actividades;
	        }
          
   - Declara el método <b>addActividad</b> que como su nombre lo indica, permitirá recibir un objeto de tipo <b>Actividad</b> y agregarlo al arreglo de actividades del objeto de tipo <b>Socio</b>. 

          public void addActividad(Actividad nueva) {
		        for( int i=0; i<actividades.length; i++) {
			        if( actividades[i] == null) {
				        actividades[i]=nueva;
				        System.out.println("Actividad Agregada... " + nueva );
				        break;
			        }else {
				        if(i==maxActividades-1) {
					        System.out.println("No tienes derecho a más actividades...");
				        }
			        }
		        }
	      }
  
  6. Abre la clase <b>GimansioTest</b>. 
  
     - Ubica la línea donde se registro a un nuevo <b>Socio</b>
     - Utiliza el método <b>addActividad</b> para agregar 3 actividades distintas a la instancia de tipo <b>Socio</b> previamente creada.
     - Imprime el mensaje: ¿Qué ejercicio hace el socio?, el número del socio, así como las actividades que tiene registradas.
     
              Socio s = Socio.registroSocio(); 
		        s.addActividad( new Yoga() );
		        s.addActividad( new Pilates() );
		        s.addActividad( new Trx() );
		        s.addActividad( new Yoga() );;
		
		        System.out.println("************************************************************");
		        System.out.println("¿Qué ejercicio hace el socio? " + s.getNumeroSocio());
		        for( Actividad temp : s.getActividades() ) {
			        temp.ejecutarActividad();
		        }

  8. Ejecuta el proyecto.
  
![Console](https://user-images.githubusercontent.com/56565204/67833093-470d9400-faa9-11e9-82cf-978789b99f3f.png)

<hr>

Felicidades, ¡Lograste los objetivos!
