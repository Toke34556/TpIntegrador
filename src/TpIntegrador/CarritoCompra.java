package TpIntegrador;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class CarritoCompra {
	private ArrayList<ItemCarrito>items;

	public CarritoCompra() {
		this.items = new ArrayList<ItemCarrito>();
	}
	
	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	
	public void mostrarCarrito() {
		DecimalFormat df = new DecimalFormat("#.##");
		if(items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(ItemCarrito i: items) {
				i.mostrarItem();
			}
		}
		System.out.println("Total Carrito: "+df.format(this.totalCarrito()));
	}
	
	public double totalCarrito() {
		double total=0;
		if(items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(ItemCarrito i: items) {
				total= total + i.getSubtotal();
			}
		}
		return total;
	}
}
