package modelo.javabean;

public class Principal {

	public static void main(String[] args) {
		
		AbstractPersona p1=new Profesor("73123170Y", "Jesus Calleja", "Zaragoza", "614215487", "Cientificas");
		AbstractPersona a1=new Alumno("73123171Z", "Carlota", "Pamplona", "123121212","1ºDam");
		AbstractPersona v1=new Administrativo("87878787Q", "Luis", "Madrid", "456457894","Facturar, Reparar");
		AbstractPersona p2=new Profesor("731236765Y", "Juan Calleja", "Cantabria", "612315487", "Comunicativas");
		AbstractPersona a2=new Alumno("73345543Z", "Javier", "Coruña", "1223432412","2ºDam");
		AbstractPersona v2=new Administrativo("87345527Q", "Pedro", "Barcelona", "4564252294","Comprar, fotocopiar");
	
		System.out.println(p1.toString());;
		System.out.println(a1.toString());;
		System.out.println(v1.toString());;
	
		System.out.println(((Profesor)p1).trabajar());
		System.out.println(((Alumno)a1).trabajar());
		System.out.println(((Administrativo)v1).trabajar());
		
		System.out.println(a1.llamar(p2));
		
		System.out.println(((Profesor)p1).ponerNotas());
		System.out.println(((Alumno)a1).hacerExamen());
		System.out.println(((Administrativo)v1).gestionarMatricula());
		
	}

}
