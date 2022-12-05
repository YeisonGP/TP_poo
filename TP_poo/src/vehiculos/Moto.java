package vehiculos;
public class Moto extends Vehiculo{

	private String marca;
	private int cilindradas;
	
	
	
	public Moto(String motor, int combustible, boolean encendido, String matricula, int ruedas, boolean desplazarse) {
		super(motor, combustible, encendido, matricula, ruedas, desplazarse);
		// TODO Auto-generated constructor stub
	}



	
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getCilindradas() {
		return cilindradas;
	}



	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	
	
	
}
