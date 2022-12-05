package EtapaMundial;
import java.util.Arrays;

import Partido.Partido;
class EtapaMundial {

	private String descriopcion;
	private Partido []partido;
	public String equiposqueavanzan; 




	public EtapaMundial() {
		super();
	}

	public String getDescriopcion() {
		return descriopcion;
	}

	public void setDescriopcion(String descriopcion) {
		this.descriopcion = descriopcion;
	}

	protected Partido[] getPartido() {
		return partido;
	}

	public String getEquiposqueavanzan() {
		return equiposqueavanzan;
	}

	@Override
	public String toString() {
		return "EtapaMundial1 [descriopcion=" + descriopcion + ", partido=" + Arrays.toString(partido)
				+ ", equiposqueavanzan=" + equiposqueavanzan + "]";
	}
	
	
}
