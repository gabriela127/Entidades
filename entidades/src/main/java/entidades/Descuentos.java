package entidades;

public class Descuentos{
	private String TipoM;
	private int Valor;
	
	

	public Descuentos(String tipoM, int valor) {
		super();
		TipoM = tipoM;
		Valor = valor;
	}

	public String getTipoM() {
		return TipoM;
	}

	public void setTipoM(String tipoM) {
		TipoM = tipoM;
	}

	public int getValor() {
		return Valor;
	}

	public void setValor(int valor) {
		Valor = valor;
	}
	
	

}

