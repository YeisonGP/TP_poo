
public class Auto extends Vehiculo {
	
	private int cantidad_de_puertas;
	private String marca;
	
	

	public Auto(String motor, int combustible, boolean encendido, String matricula, int ruedas, boolean desplazarse,
			int cantidad_de_puertas, String marca) {
		super(motor, combustible, encendido, matricula, ruedas, desplazarse);
		this.cantidad_de_puertas = cantidad_de_puertas;
		this.marca = marca;
	}



	public Auto(String motor, int combustible, boolean encendido, String matricula, int ruedas, boolean desplazarse) {
		super(motor, combustible, encendido, matricula, ruedas, desplazarse);
		// TODO Auto-generated constructor stub
	}



	public int getCantidad_de_puertas() {
		return cantidad_de_puertas;
	}



	public void setCantidad_de_puertas(int cantidad_de_puertas) {
		this.cantidad_de_puertas = cantidad_de_puertas;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setDesplazarse(boolean desplazarse) {
		super.desplazarse = desplazarse;
	}



	@Override
	public String toString() {
		return "Auto [cantidad_de_puertas=" + cantidad_de_puertas + ", marca=" + marca + ", desplazarse=" + desplazarse
				+ ", getCantidad_de_puertas()=" + getCantidad_de_puertas() + ", getMarca()=" + getMarca()
				+ ", getMotor()=" + getMotor() + ", getCombustible()=" + getCombustible() + ", isEncendido()="
				+ isEncendido() + ", getMatricula()=" + getMatricula() + ", getRuedas()=" + getRuedas()
				+ ", isDesplazarse()=" + isDesplazarse() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
