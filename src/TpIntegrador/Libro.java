package TpIntegrador;

import java.time.LocalDate;

public class Libro extends Producto {

	private String titulo;
	private String autor;
	private String editorial;
	
	
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
	
	public Libro(String titulo, String autor, String editorial,  LocalDate fechaPublicacion,double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.setFechaPublicacion(fechaPublicacion);
		this.setPrecio(precio);
	}	
	
	public Libro(String titulo, String autor, String editorial,  LocalDate fechaPublicacion,double precio,boolean fisico) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.setFechaPublicacion(fechaPublicacion);
		this.setPrecio(precio);
		this.setFisico(fisico);
	}

	public double precioCompra() {
		if (this.isFisico()) {
			return (this.getPrecio()*1.18);
		}
		else {
			return (this.getPrecio()*1.08);
		}	
	}
	
	
	
}
