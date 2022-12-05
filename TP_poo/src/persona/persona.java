package persona;
import java.util.Arrays;

import persona.empleado;
public class persona {

	private String dni;
	private String nombre;
	private String telefono;
	private String direccion;
	private empleado[] empleado;
	public persona(String dni, String nombre, String telefono, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public empleado[] getEmpleado() {
		return empleado;
	}
	public void setEmpleado(empleado[] empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", empleado=" + Arrays.toString(empleado) + "]";
	}
	
	
}
