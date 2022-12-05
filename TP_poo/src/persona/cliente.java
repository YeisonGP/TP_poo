package persona;

class cliente {
	
	private String nombreCliente;
	private String dniCliente;
	private String patenteCliente;
	public cliente(String nombreCliente, String dniCliente, String patenteCliente) {
		super();
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.patenteCliente = patenteCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getPatenteCliente() {
		return patenteCliente;
	}
	public void setPatenteCliente(String patenteCliente) {
		this.patenteCliente = patenteCliente;
	}

	
}
