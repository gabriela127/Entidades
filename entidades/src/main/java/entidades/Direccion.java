package entidades;

public class Direccion {
	 private int numero;
	    private String ciudad;
	    private String pais;
	    
		public Direccion(int numero, String ciudad, String pais) {
			super();
			this.numero = numero;
			this.ciudad = ciudad;
			this.pais = pais;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public String getPais() {
			return pais;
		}
		public void setPais(String pais) {
			this.pais = pais;
		}
	    
	    
	    
}
