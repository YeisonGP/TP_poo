package Torneo;
import java.util.ArrayList;
public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntajeEtapaGrupo;
	public Equipo(String nombre, ArrayList<Partido> partidosJugados, int puntajeEtapaGrupo) {
		super();
		this.nombre = nombre;
		this.partidosJugados = partidosJugados;
		this.puntajeEtapaGrupo = puntajeEtapaGrupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Partido> getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public int getPuntajeEtapaGrupo() {
		return puntajeEtapaGrupo;
	}
	public void setPuntajeEtapaGrupo(int puntajeEtapaGrupo) {
		this.puntajeEtapaGrupo = puntajeEtapaGrupo;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", partidosJugados=" + partidosJugados + ", puntajeEtapaGrupo="
				+ puntajeEtapaGrupo + "]";
	}
	
	
}
