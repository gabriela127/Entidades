package entidades;
import java.util.List;


public class Clientes {
	 private String nombre;
	    private Direccion direccion;
	    private List<Compras> compras;
	    
		public Clientes(String nombre, Direccion direccion, List<Compras> compras) {
			super();
			this.nombre = nombre;
			this.direccion = direccion;
			this.compras = compras;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Direccion getDireccion() {
			return direccion;
		}
		public void setDireccion(Direccion direccion) {
			this.direccion = direccion;
		}
		public List<Compras> getCompras() {
			return compras;
		}
		public void setCompras(List<Compras> compras) {
			this.compras = compras;
		}
	    
	    
	    
}
