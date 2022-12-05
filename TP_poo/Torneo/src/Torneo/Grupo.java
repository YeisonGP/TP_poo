package Torneo;
import java.util.ArrayList;
public class Grupo extends EtapaMudial{

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
