package Estapa;
import partido.Equipo;
import partido.partido;
import java.util.Arrays;

public abstract class EtapaMundial {

	private String descripcionEtapa;
	private partido[]partido;
	protected Equipo[]Equipo;
	
	
	
	public EtapaMundial(String descripcionEtapa) {
		this.setDescripcionEtapa(descripcionEtapa);
	}


	public String getDescripcionEtapa() {
		return descripcionEtapa;
	}


	public void setDescripcionEtapa(String descripcionEtapa) {
		this.descripcionEtapa = descripcionEtapa;
	}


	public partido[] getPartido() {
		return partido;
	}
	public Equipo[] getEquipo() {
		return Equipo;
	}


	public void setEquipo(Equipo[] equipo) {
		Equipo = equipo;
	}

	public void setPartido(partido[] partido) {
		this.partido = partido;
	}

	public Equipo[] getEquipoQueAvanzan() {
		return Equipo;
	}
	
	@Override
	public String toString() {
		return "EtapaMundial [descripcionEtapa=" + descripcionEtapa + ", partido=" + Arrays.toString(partido)
				+ ", Equipo=" + Arrays.toString(Equipo) + "]";
	}

	




	


}
