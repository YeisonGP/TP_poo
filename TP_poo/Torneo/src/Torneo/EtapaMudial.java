package Torneo;
import Torneo.Partido;
import java.util.ArrayList;
public class EtapaMudial {

	 private String descripcionEtapa;
	    private ArrayList<Partido> partidos;
	    private ArrayList<Equipo> equiposQueAvanzan;
	    
	    
		public EtapaMudial(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposQueAvanzan) {
			super();
			this.descripcionEtapa = descripcionEtapa;
			this.partidos = partidos;
			this.equiposQueAvanzan = equiposQueAvanzan;
		}
		
		public String getDescripcionEtapa() {
			return descripcionEtapa;
		}
		public void setDescripcionEtapa(String descripcionEtapa) {
			this.descripcionEtapa = descripcionEtapa;
		}
		public ArrayList<Partido> getPartidos() {
			return partidos;
		}
		protected void setPartidos(ArrayList<Partido> partidos) {
			this.partidos = partidos;
		}
		protected ArrayList<Equipo> getEquiposQueAvanzan() {
			return equiposQueAvanzan;
		}
		public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
			this.equiposQueAvanzan = equiposQueAvanzan;
		}
		@Override
		public String toString() {
			return "EtapaMudial [descripcionEtapa=" + descripcionEtapa + ", partidos=" + partidos
					+ ", equiposQueAvanzan=" + equiposQueAvanzan + "]";
		}
	    
	    
}
