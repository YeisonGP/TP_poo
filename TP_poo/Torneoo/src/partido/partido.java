package partido;
public class partido  {
	private int dia;
	private int mes;
	private int a�o;
	private String hora;
	private Equipo local;
	private Equipo visitante;
	private Resultado resultado;
	private int attribute;

	
	public partido(int dia, int mes, int a�o, String hora, Equipo local, Equipo visitante, Resultado resultado,
			int attribute) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.hora = hora;
		this.local = local;
		this.visitante = visitante;
		this.resultado = resultado;
		this.attribute = attribute;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	public int getAttribute() {
		return attribute;
	}
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}
	@Override
	public String toString() {
		return "partido [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + ", hora=" + hora + ", local=" + local
				+ ", visitante=" + visitante + ", resultado=" + resultado + ", attribute=" + attribute + "]";
	}
	
	
	
}
