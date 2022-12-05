
public class Garage {

	private int capacidad = 25;
	private String direccion;
	private int precio = 500;
	public boolean ver_capacidad=true;
	public boolean ingresar=true;
	public String mandar_aviso;
	

	
	public Garage(int capacidad, String direccion, int precio, boolean ver_capacidad, boolean ingresar,
			String mandar_aviso) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.precio = precio;
		this.ver_capacidad = ver_capacidad;
		this.ingresar = ingresar;
		this.mandar_aviso = mandar_aviso;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isVer_capacidad() {
		return ver_capacidad;
	}
	public void setVer_capacidad(boolean ver_capacidad) {
		this.ver_capacidad = ver_capacidad;
	}
	public boolean isIngresar() {
		return ingresar;
	}
	public void setIngresar(boolean ingresar) {
		this.ingresar = ingresar;
	}
	public String getMandar_aviso() {
		return mandar_aviso;
	}
	public void setMandar_aviso(String mandar_aviso) {
		this.mandar_aviso = mandar_aviso;
	}
	
	
	
}
