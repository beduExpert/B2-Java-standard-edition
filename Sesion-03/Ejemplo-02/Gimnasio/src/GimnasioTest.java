
public class GimnasioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Actividad a = new Actividad(); //Declarando una instancia de tipo Actividad
		
		Socio s = new Socio(); //Declarando una instancia de tipo socio
		s.nombre="Porfirio";
		s.numeroSocio=33;
		s.correoElectronico="porfiriod@gmail.com";
		s.telefono="333-22-22";
		
		System.out.println("Imprimiendo Socio, número: " + s.numeroSocio);
		System.out.println("Nombre: " + s.nombre);
		System.out.println("Correo Electrónico: " + s.correoElectronico);
		System.out.println("Teléfono: " + s.telefono);
		
	}
}
