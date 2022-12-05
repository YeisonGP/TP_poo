package vehiculos;
public class Moto{

	private String marca;
	private int cc;
	private int km;
	private int cantRuedas;
	public Moto(String marca, int cc, int km, int cantRuedas) {
		super();
		this.marca = marca;
		this.cc = cc;
		this.km = km;
		this.cantRuedas = cantRuedas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
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
		return "Moto [marca=" + marca + ", cc=" + cc + ", km=" + km + ", cantRuedas=" + cantRuedas + "]";
	}

	
	
	
}
