package TpIntegrador;

import java.text.DecimalFormat;
public class ItemCarrito {

private Producto producto;
private int cantidad;

public ItemCarrito(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
}
public ItemCarrito(Producto producto, int cantidad, boolean fisico) {
    this.producto = producto;
    this.cantidad = cantidad;
    this.producto.setFisico(fisico);
}

public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double getSubtotal() {
    double precio = 0;
    if (producto instanceof Libro) {
        precio = ((Libro) producto).precioCompra();
    } else if (producto instanceof Revista) {
        precio = ((Revista) producto).precioCompra();
    }
    return cantidad * precio;
}

public void mostrarItem() {
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	if (producto instanceof Libro) {
	      System.out.println("cod: "+this.producto.getCodigo()+" Titulo: "+this.producto.getTitulo());
	      System.out.println(" PrecioUnitario: "+df.format(this.producto.precioCompra())+" cant: "+this.getCantidad()+" Subtotal: "+df.format(this.getSubtotal()));
	    } else if (producto instanceof Revista) {
	     System.out.println("cod: "+this.producto.getCodigo()+" Titulo: "+this.producto.getNombre());  
	     System.out.println(" PrecioUnitario: "+df.format(this.producto.precioCompra())+" cant: "+this.getCantidad()+" Subtotal: "+df.format(this.getSubtotal()));
	    }
	    
	System.out.println("-----------------------------------------------------------------");
}
}
