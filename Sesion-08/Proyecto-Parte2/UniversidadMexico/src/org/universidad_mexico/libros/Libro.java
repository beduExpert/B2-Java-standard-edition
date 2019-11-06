package org.universidad_mexico.libros;
 
public abstract class Libro {

	 public int id;//#id
	 public String titulo;//título
	 public String autor;//autor
	 public String editorial;//editorial
	 public String descripcion;//descripción
	 public int numeroUnidades;//#unidades
	 
	 public abstract void tiempoRetorno();
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNumeroUnidades() {
		return numeroUnidades;
	}
	public void setNumeroUnidades(int numeroUnidades) {
		this.numeroUnidades = numeroUnidades;
	}
	 
	 
}
