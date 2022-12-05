package vehiculos;
import persona.persona;
public class Vehiculo {

	private String motor;
	private int combustible;
	private boolean encendido;
	private String patente;
	private int ruedas;
	public  boolean desplazarse =false;
	private String Ntitular;
	private String dniTitular;
	private String dni;
	private String nombre;
	private String telefono;
	private String direccion;
	private persona[]persona;
	private Auto[]Auto;
	private Moto[]Moto;
	public Vehiculo(String motor, int combustible, boolean encendido, String patente, int ruedas, boolean desplazarse,
			String ntitular, String dniTitular, String dni, String nombre, String telefono, String direccion) {
		super();
		this.motor = motor;
		this.combustible = combustible;
		this.encendido = encendido;
		this.patente = patente;
		this.ruedas = ruedas;
		this.desplazarse = desplazarse;
		Ntitular = ntitular;
		this.dniTitular = dniTitular;
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
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
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
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
	public String getNtitular() {
		return Ntitular;
	}
	public void setNtitular(String ntitular) {
		Ntitular = ntitular;
	}
	public String getDniTitular() {
		return dniTitular;
	}
	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}
	@Override
	public String toString() {
		return "Vehiculo [motor=" + motor + ", combustible=" + combustible + ", encendido=" + encendido + ", patente="
				+ patente + ", ruedas=" + ruedas + ", desplazarse=" + desplazarse + ", Ntitular=" + Ntitular
				+ ", dniTitular=" + dniTitular + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}
	
	
}
