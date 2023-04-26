package TpIntegrador;

import java.time.LocalDate;

public class Revista extends Producto {
	private String nombre;
	private String editor;
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditor() {
		return this.editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public Revista(String nombre, String editor,  LocalDate fechaPublicacion,double precio) {
		this.nombre = nombre;
		this.editor = editor;
		this.setFechaPublicacion(fechaPublicacion);
		this.setPrecio(precio);
	}
	public Revista(String nombre, String editor,  LocalDate fechaPublicacion,double precio,boolean fisico) {
		this.nombre = nombre;
		this.editor = editor;
		this.setFechaPublicacion(fechaPublicacion);
		this.setPrecio(precio);
		this.setFisico(fisico);
	}
	public double precioCompra() {
		if (this.isFisico()) {
			return (this.getPrecio()*1.22);
		}
		else {
			return (this.getPrecio()*1.12);
		}
		
	}
	public void CargarProducto(Revista l) {
		ConexionSQL.EnviarSentencia("INSERT INTO producto (FechaPublicacion, precio) VALUES ("+l.getFechaPublicacion()+","+l.getPrecio()+")");
		ConexionSQL.EnviarSentencia("INSERT INTO libro (Codigo,Nombre,Editor) VALUES (LAST_INSERT_ID()"+l.getNombre()+","+l.getEditor()+")");
	}
}
