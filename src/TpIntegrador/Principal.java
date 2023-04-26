package TpIntegrador;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
	
		LocalDate fecha = LocalDate.now();
		Libro a = new Libro("el caballero de la armadura oxidada","alguien","alguna",fecha,100);
		
		// 	public Revista(String nombre, String editor,  LocalDate fechaPublicacion,double precio)
		Revista b = new Revista("clubplay","alguno",fecha,100);
		Revista c = new Revista("Para ti","clarin que se yo",fecha,100);
		Libro d = new Libro("el cuervo","Edgardo alan Pou","editorial xd",fecha,100);
	
	
		ItemCarrito item= new ItemCarrito(a, 2);
		ItemCarrito item2= new ItemCarrito(b, 1);
		ItemCarrito item3 = new ItemCarrito(c, 1, false);
		ItemCarrito item4 = new ItemCarrito(d, 1, false);
	

		CarritoCompra carrito =  new CarritoCompra(); 
		carrito.agregarItem(item2);
		carrito.agregarItem(item);
		carrito.agregarItem(item3);
		carrito.agregarItem(item4);
		carrito.mostrarCarrito();
		//ConexionSQL.conectar("");
		
	
	}
}
