package Torneo;
import java.util.ArrayList;

public class Llave extends EtapaMudial {
	
	private ArrayList<Equipo> equiposQueAvanzan;
	
	public Llave() {
	}
	
	public Llave (String descripcionEtapa) {
        this.equiposQueAvanzan = new ArrayList<Equipo>();
    }

	@Override
	public ArrayList<Equipo> getEquiposQueAvanzan(){
		return super.getEquiposQueAvanzan();
	}

	@Override
	public String toString() {
		return "Llave [equiposQueAvanzan=" + equiposQueAvanzan + "]";
	}
	
	
	
}
