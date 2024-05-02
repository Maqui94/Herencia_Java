package modelo.javabean;

public class Profesor extends AbstractPersona {
	private String competencias;

	public Profesor() {
		super();
	}

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}


	

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	@Override
	public String toString() {
		return "Profesor [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", competencias=" + competencias + "]";
	}

	@Override
	public String trabajar() {
		
		return "el profesor " + this.nombre + " va impartir su clase";
	}
	public String ponerNotas() {
		return "El profesor " + this.nombre + " va corregir los examenes";
	}
	





}
