package TpIntegrador;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
	
		LocalDate fecha = LocalDate.now();
		Libro a = new Libro("el caballero de la armadura oxidada","alguien","alguna",fecha,200);
		
		// 	public Revista(String nombre, String editor,  LocalDate fechaPublicacion,double precio)
		Revista b = new Revista("clubplay","alguno",fecha,20000);
		
	
	
		ItemCarrito item= new ItemCarrito(a, 2);
		ItemCarrito item2= new ItemCarrito(b, 1);
	

		CarritoCompra carrito =  new CarritoCompra(); 
		carrito.agregarItem(item2);
		carrito.agregarItem(item);
		
		carrito.mostrarCarrito();
		
		
	
	}
}
