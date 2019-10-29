
public class Pedido {
	private int numeroPedido;
	private double montoFinal;
	private Producto listaProducto[] = new Producto[10];
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public double getMontoFinal() {
		return montoFinal;
	}
	
	public void setMontoFinal(double montoFinal) {
		this.montoFinal = montoFinal;
	}
	
	public Producto[] getListaProducto() {
		return listaProducto;
	}
	
	public void setListaProducto(Producto[] listaProducto) {
		this.listaProducto = listaProducto;
	}
	
	//sumaCostos
	//agregarElemento
}
