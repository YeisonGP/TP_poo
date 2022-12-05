package Torneo;
import java.util.ArrayList;
public class Grupo extends EtapaMudial{

	public Grupo(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposQueAvanzan) {
		super(descripcionEtapa, partidos, equiposQueAvanzan);
		// TODO Auto-generated constructor stub
	}


	private ArrayList<Equipo> equiposQueAvanzan;   
  

	

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan(){
      
        return super.getEquiposQueAvanzan();
    }


	@Override
	public String toString() {
		return "Grupo [equiposQueAvanzan=" + equiposQueAvanzan + "]";
	} 
}
