package entidades;

public class Productos {
	
	private int Id_Producto;
	private String NombreP;
	private double Precio;
	private int CantidadP;
	
	
	public Productos(int id_Producto, String nombreP, double precio, int cantidadP) {
		super();
		Id_Producto = id_Producto;
		NombreP = nombreP;
		Precio = precio;
		CantidadP = cantidadP;
	}
	
	public int getId_Producto() {
		return Id_Producto;
	}
	public void setId_Producto(int id_Producto) {
		Id_Producto = id_Producto;
	}
	public String getNombreP() {
		return NombreP;
	}
	public void setNombreP(String nombreP) {
		NombreP = nombreP;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getCantidadP() {
		return CantidadP;
	}
	public void setCantidadP(int cantidadP) {
		CantidadP = cantidadP;
	}
	

}

