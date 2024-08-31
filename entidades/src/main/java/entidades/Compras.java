package entidades;

import java.util.List;

public class Compras {
	private int Id_Compra;
	private String Fecha;
	private double Total;
	
	
	public Compras(int id_Compra, String fecha, double total) {
		super();
		Id_Compra = id_Compra;
		Fecha = fecha;
		Total = total;
		
	}
	public int getId_Compra() {
		return Id_Compra;
	}
	public void setId_Compra(int id_Compra) {
		Id_Compra = id_Compra;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}

	
	
	

}

