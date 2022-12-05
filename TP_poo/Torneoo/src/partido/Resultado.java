package partido;
class Resultado {
	private int golesLocal;
	private int golesVisitante;
	private boolean ganoLocal;
	private boolean ganoVisitante;
	private boolean Empate;
	public Resultado(int golesLocal, int golesVisitante, boolean ganoLocal, boolean ganoVisitante, boolean empate) {
		super();
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.ganoLocal = ganoLocal;
		this.ganoVisitante = ganoVisitante;
		Empate = empate;
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
	public boolean isGanoLocal() {
		return ganoLocal;
	}
	public void setGanoLocal(boolean ganoLocal) {
		this.ganoLocal = ganoLocal;
	}
	public boolean isGanoVisitante() {
		return ganoVisitante;
	}
	public void setGanoVisitante(boolean ganoVisitante) {
		this.ganoVisitante = ganoVisitante;
	}
	public boolean isEmpate() {
		return Empate;
	}
	public void setEmpate(boolean empate) {
		Empate = empate;
	}
	@Override
	public String toString() {
		return "Resultado [golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + ", ganoLocal=" + ganoLocal
				+ ", ganoVisitante=" + ganoVisitante + ", Empate=" + Empate + ", getGolesLocal()=" + getGolesLocal()
				+ ", getGolesVisitante()=" + getGolesVisitante() + ", isGanoLocal()=" + isGanoLocal()
				+ ", isGanoVisitante()=" + isGanoVisitante() + ", isEmpate()=" + isEmpate() + "]";
	}

	
	
	
	
}
