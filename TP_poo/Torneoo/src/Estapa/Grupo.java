package Estapa;

import partido.Equipo;

class Grupo extends EtapaMundial{

	
	public Equipo[] getEquipoQueAvanzan() {
		return Equipo;
	}
	
	public Grupo(String descripcionEtapa) {
		super(descripcionEtapa);

	}

}
