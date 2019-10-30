public class GimnasioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Socio s = Socio.registroSocio(); //Invocación del método registroSocio(static), retornará la instancia de tipo Socio creada.
		s.addActividad( new Yoga() );
		s.addActividad( new Pilates() );
		s.addActividad( new Yoga() );

		System.out.println("************************************************************");
		System.out.println("¿Qué ejercicio hace el socio? " + s.getNumeroSocio());
		for( Actividad temp : s.getActividades() ) {
			temp.ejecutarActividad();
		}
			
	}
	
}
