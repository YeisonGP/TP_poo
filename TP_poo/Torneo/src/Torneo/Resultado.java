package Torneo;

public class Resultado {
    private int golesLocal;
    private int golesVisitante;
	public Resultado(int golesLocal, int golesVisitante) {
		super();
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
    
    public boolean empate(){
        if(this.golesLocal == this.golesVisitante){
            return true;
        }
        else{
            return false;
        }
    }
	@Override
	public String toString() {
		return "Resultado [golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + "]";
	}
    
    
}
