package com.proyecto.dir2;

public class Banco {
	
	//1. No es posible acceder a la clases Cliente ya que se encuentra en otro paquete distinto al del la clase Banco.
	//Cliente c = new Cliente();
	
	//2. Resolviendo con qualified name.
	//com.proyeto.dir1.Cliente c = new com.proyeto.dir1.Cliente();
	
	//3. Resolviendo con import
	//Cliente c = new Cliente();
	
	//4. ¿Qué pasaría si necesitamos una instancia de tipo Cliente y otra de tipo Cuenta?
	/*Cliente c = new Cliente();
	Cuenta cu = new Cuenta();*/ //Opción 1: Imports Adicionales & Opción 2: Import con comodín.
	
	//5. Demo creación paquete.
}
