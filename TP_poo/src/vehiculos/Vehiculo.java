package vehiculos;
public class Vehiculo {

	private String motor;
	private int combustible;
	private boolean encendido;
	private String matricula;
	private int ruedas;
	public  boolean desplazarse =false;
	public Vehiculo(String motor, int combustible, boolean encendido, String matricula, int ruedas,
			boolean desplazarse) {
		super();
		this.motor = motor;
		this.combustible = combustible;
		this.encendido = encendido;
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.desplazarse = desplazarse;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public boolean isDesplazarse() {
		return desplazarse;
	}
	public void setDesplazarse(boolean desplazarse) {
		this.desplazarse = desplazarse;
	}
	@Override
	public String toString() {
		return "Vehiculo [motor=" + motor + ", combustible=" + combustible + ", encendido=" + encendido + ", matricula="
				+ matricula + ", ruedas=" + ruedas + ", desplazarse=" + desplazarse + "]";
	}
	
	
}
