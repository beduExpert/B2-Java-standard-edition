package org.universidad_mexico.estudiantes;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import org.universidad_mexico.libros.Libro;

public class Alumno {
	 private String nombre;//Nombre
	 private int numeroCuenta;//NúmeroCuenta
	 private String correoElectronico;//CorreoElectrónico
	 private final int MAX_LIBROS = 3;
     private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
     private static Path p = Paths.get("archivo.txt"); //Generando objeto de tipo Path para manipular archivo.txt

	 
	 public Alumno(String nombre, int numeroCuenta, String correElectronico) {		
		 this.nombre=nombre;
		 this.numeroCuenta=numeroCuenta;
		 this.correoElectronico=correElectronico;
	 }
	 
	 public String toString() {
		 return getNombre() + " " + getNumeroCuenta();
	 }
	 
	 public void addLibro(Libro nuevo) {
		 if( listaLibros.size() == MAX_LIBROS) {
			 System.out.println("No puedes solicitar más libros...");
		 }else {
			 listaLibros.add(nuevo);
			 System.out.println("Libro agregado...");
		 }		 
	 }
	 
	 public static ArrayList<Alumno> registraAlumno() {		
		 	System.out.println("************** BIENVENIDO A REGISTRO ALUMNO ***************");
		 	ArrayList<Alumno> lista =new ArrayList<Alumno>();		 
		 	try {
		 		Scanner input = new Scanner( new File(p.toString()) );
		 		while(input.hasNext()) {
		 			String nombre = input.next();
					int numeroCuenta = input.nextInt();
					String correoElectronico = input.next();
					
					/****CREANDO INSTANCIA****/
					Alumno a = new Alumno(nombre, numeroCuenta, correoElectronico);
					lista.add(a);
					System.out.println("Éxito al registrar alumno: " + a.nombre);
					System.out.println("************************************************************");						
		 		}		 		
		 	}catch(FileNotFoundException e) {
		 		System.out.println("Archivo no encontrado");
		 	}
			return lista;			
	 }
	 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	 
	 
}
