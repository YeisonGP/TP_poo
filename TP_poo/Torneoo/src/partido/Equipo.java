
package partido;
public class Equipo {
	private String nombre;
	private partido[]partido;
	private String EquipoQueAvanza;



	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public partido[] getPartido() {
		return partido;
	}

	public void setPartido(partido[] partido) {
		this.partido = partido;
	}

	public String getEquipoQueAvanza() {
		return EquipoQueAvanza;
	}

	public void setEquipoQueAvanza(String equipoQueAvanza) {
		EquipoQueAvanza = equipoQueAvanza;
	}
	
	
}
