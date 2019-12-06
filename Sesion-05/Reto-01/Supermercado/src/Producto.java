
public class Producto {
	
	public String nombre;          //nombre
	public int porcentajeImpuesto; //porcentaje de impuesto
	public double costo;           //costo
	public String marca;           //marca
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPorcentajeImpuesto() {
		return porcentajeImpuesto;
	}
	
	public void setPorcentajeImpuesto(int porcentajeImpuesto) {
		this.porcentajeImpuesto = porcentajeImpuesto;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}	
}
