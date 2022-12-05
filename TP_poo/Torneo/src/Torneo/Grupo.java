package Torneo;
import java.util.ArrayList;
public class Grupo extends EtapaMudial{

	private ArrayList<Equipo> equiposQueAvanzan;   
  
    public Grupo() {
        super();
        
    }
    
    
	public Grupo(String descripcionEtapa) {
		super();
		setDescripcionEtapa(descripcionEtapa);
		this.equiposQueAvanzan = new ArrayList<Equipo>();
	}
	

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan(){
      
        return super.getEquiposQueAvanzan();
    }


	@Override
	public String toString() {
		return "Grupo [equiposQueAvanzan=" + equiposQueAvanzan + "]";
	} 
}
