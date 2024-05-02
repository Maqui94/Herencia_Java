package testing;

import modelo.DAO.Instituto;
import modelo.javabean.AbstractPersona;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class TestInstitutoDao {

	private static Instituto idao;
	static {
		idao=new Instituto();
	}
	
	public static void main(String[] args) {
		AbstractPersona p2=new Profesor("731236765Y", "Juan Calleja", "Cantabria", "612315487", "Comunicativas");
		AbstractPersona a2=new Alumno("73345543Z", "Javier", "Coruña", "1223432412","2ºDam");
		AbstractPersona v2=new Administrativo("87345527Q", "Pedro", "Barcelona", "4564252294","Comprar, fotocopiar");
			
		System.out.println(idao.buscarTodas());
		System.out.println("Personas al principio");
		idao.altaPersona(p2);
		idao.altaPersona(a2);
		idao.altaPersona(v2);
		System.out.println("Personas despues del alta");
		System.out.println(idao.buscarTodas());
		
		idao.eliminarPersona(idao.buscarPersona("73345543Z"));
		System.out.println(idao.buscarTodas());
		System.out.println("Persona eliminada");
		
		System.out.println("Buscar persona");
		System.out.println(idao.buscarPersona("87345527Q"));
		System.out.println(idao.buscarPersona("73123171Z"));
		System.out.println(idao.buscarPersona("731236765Y"));
		System.out.println("Personas por tipo");
		System.out.println(idao.buscarPersonasPorTipo("Profesor"));
		System.out.println(idao.buscarPersonasPorTipo("Administrativo"));
		System.out.println(idao.buscarPersonasPorTipo("Alumno"));
		
		System.out.println("Fin");
		System.out.println("Profesores");
		System.out.println(idao.buscarPersonasPorTipo("Profesor").size());
		System.out.println("Alumno");
		System.out.println(idao.buscarPersonasPorTipo("Alumno").size());
		System.out.println("Admin");
		System.out.println(idao.buscarPersonasPorTipo("Administrativo").size());
		
		}
	}


