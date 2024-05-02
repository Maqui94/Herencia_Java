package modelo.javabean;

public class  Administrativo extends AbstractPersona {

	private String tareas;
	
	public Administrativo() {
		super();
	}

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	
	@Override
	public String toString() {
		return "Administrativo [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", tareas=" + tareas + "]";
	}

	@Override
	public String trabajar() {
		return "El administrativo " + this.nombre +" va a realizar estas tareas: " + this.tareas;
	}

	public String gestionarMatricula() {
		 return "El administrativo " + this.nombre + " a gestionar una matrícula";
	 }
	
}
