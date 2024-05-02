package modelo.DAO;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.AbstractPersona;

public interface InstitutoDao {
	boolean altaPersona(AbstractPersona persona);
	AbstractPersona buscarPersona(String nif);
	List<AbstractPersona>buscarTodas();
	boolean eliminarPersona(AbstractPersona persona);
	List<AbstractPersona>buscarPersonasPorTipo(String tipoPersona);
}
