package modelo.DAO;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.AbstractPersona;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class Instituto implements InstitutoDao {
	private List<AbstractPersona> personas;
	private String nombreInstituto;
	private void cargarDatos() {
		AbstractPersona p1=new Profesor("73123170Y", "Jesus Calleja", "Zaragoza", "614215487", "Cientificas");
		AbstractPersona a1=new Alumno("73123171Z", "Carlota", "Pamplona", "123121212","1ºDam");
		AbstractPersona v1=new Administrativo("87878787Q", "Luis", "Madrid", "456457894","Facturar, Reparar");
		
		personas.add(p1);
		personas.add(a1);
		personas.add(v1);
	}
	
	public Instituto() {
		nombreInstituto="UNIR";
		personas=new ArrayList<AbstractPersona>();
		cargarDatos();		
	}
	
	@Override
	public boolean altaPersona(AbstractPersona persona) {
		if (personas.contains(persona))
			return false;
			else
				return personas.add(persona);
	}
	@Override
	public AbstractPersona buscarPersona(String nif) {
		for (AbstractPersona persona: personas) {
            if (persona.getNif().equals(nif))
                return persona;
        } 
        return null;
  
	}
	@Override
	public List<AbstractPersona> buscarTodas() {
		
		return personas;
	}
	@Override
	public boolean eliminarPersona(AbstractPersona persona) {
	       if (personas.contains(persona)) {
	            System.out.println("Se ha eliminado correctamente");
	            return personas.remove(persona);
	        }
	        else {
	            System.out.println("Esta persona no se encuentra en la lista");
	            return false;
	            }
	    }
	@Override
	public List<AbstractPersona> buscarPersonasPorTipo(String tipoPersona) {
		List<AbstractPersona>personasPorTipo=new ArrayList<>();
		for (AbstractPersona persona:personas) {
			if (("Alumno".equals(tipoPersona)&& persona instanceof Alumno)||
	                ("Profesor".equals(tipoPersona) && persona instanceof Profesor) ||
	                ("Administrativo".equals(tipoPersona) && persona instanceof Administrativo)) {
				personasPorTipo.add(persona);
	            }
	        }
	        return personasPorTipo;
	    }
		
	}

