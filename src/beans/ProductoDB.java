package beans;

import java.util.ArrayList;
import java.util.List;

public class ProductoDB {
	
	private static List<Producto> catalog;
	
	public ProductoDB() {
		catalog = new ArrayList<>();
		catalog.add(new Producto(1,"Informatica","Portatil Asus",480));
		catalog.add(new Producto(1,"Imagen y Sonido","Televisor Sony",1200));
		catalog.add(new Producto(1,"Telefonia","Iphone 7s",480));
		catalog.add(new Producto(1,"Informatica","Portatil Dell",380));
		catalog.add(new Producto(1,"Imagen y Sonido","Televisor Samsung",1200));
		catalog.add(new Producto(1,"Telefonia","Iphone 8s",480));
		catalog.add(new Producto(1,"Informatica","Portatil HP",480));
		catalog.add(new Producto(1,"Imagen y Sonido","Televisor AOC",1200));
		catalog.add(new Producto(1,"Telefonia","Iphone X",480));

	}
	public List<Producto> getAll(){
		return catalog;
	}

}
