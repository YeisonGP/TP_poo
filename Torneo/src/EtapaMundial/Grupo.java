package EtapaMundial;

import Partido.Partido;

public class Grupo extends EtapaMundial {

	public Grupo(String descriopcion, Partido[] partido) {
		super(descriopcion, partido);
		// TODO Auto-generated constructor stub
	}

	private String EquiposQueAvanzan;

	@Override
	public String toString() {
		return "Grupo [EquiposQueAvanzan=" + EquiposQueAvanzan + "]";
	}
	
}
