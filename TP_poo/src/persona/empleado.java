package persona;
public class empleado {
	

	private String dni_empleado;
	private boolean empleado= false;
	
	public empleado(String dni_empleado, boolean empleado) {
		super();
		this.dni_empleado = dni_empleado;
		this.empleado = empleado;
	}

	public String getDni_empleado() {
		return dni_empleado;
	}

	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
	}

	public boolean isEmpleado() {
		return empleado;
	}

	public void setEmpleado(boolean empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "empleado [dni_empleado=" + dni_empleado + ", empleado=" + empleado + "]";
	}
	
	
}
