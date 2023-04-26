package TpIntegrador;

import java.time.LocalDate;

public abstract class Producto {
	private LocalDate fechaPublicacion;
	private int codigo;
	private double precio;
	private boolean fisico=true;
	
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isFisico() {
		return fisico;
	}
	public void setFisico(boolean fisico) {
		this.fisico = fisico;
	}
	
	public abstract double precioCompra();
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract String getTitulo();
	public abstract String getNombre();
	public abstract String getEditor();
	public abstract String getEditorial();
	public abstract String getAutor();
	
	public abstract void CargarProducto();
	public abstract void BorrarProducto();
}
	
	
