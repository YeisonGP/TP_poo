package vehiculos;
public class Auto {
	

	private String marca;
	private int cantPuertas; 
	private int km;
	private int cantRuedas;
	public Auto(String marca, int cantPuertas, int km, int cantRuedas) {
		super();
		this.marca = marca;
		this.cantPuertas = cantPuertas;
		this.km = km;
		this.cantRuedas = cantRuedas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", cantPuertas=" + cantPuertas + ", km=" + km + ", cantRuedas=" + cantRuedas
				+ "]";
	}
	
	

	
}
	

