
public class Test {
	public static void main(String [] args) {
		Alumno[] arrayAlumnos = new Alumno[2];
		Profesor[] arrayProfesor = new Profesor[3];
		Alumno alumnoUno = new Alumno("Miqueas","Brambilla","Micky@gmail.com","esta",5);
		Alumno alumnoDos = new Alumno("Ignacio","Carrera","Nachis@gmail.com","esta",3);
		Profesor profesorUno = new Profesor("Ricky","Fort","Belleza y moda","Ricky@gmail.com","Humanidades");
		Profesor profesorDos = new Profesor("Maria","Pistanieta","Musica","Maria@gmail.com","Bellas artes");
		Profesor profesorTres = new Profesor("Mirtha","Legrand","Historia mundial","mirta@hotmail.com","Humanidades");
		arrayAlumnos[0] = alumnoUno;
		arrayAlumnos[1] = alumnoDos;
		arrayProfesor[0] = profesorUno;
		arrayProfesor[1] = profesorDos;
		arrayProfesor[2] = profesorTres;
		
		System.out.println("Alumnos: ");
		for (int n = 0; n < arrayAlumnos.length; n++) {
			System.out.println(arrayAlumnos[n].tusDatos());
		}
		System.out.println("Profesores: ");
		for (int n = 0; n < arrayProfesor.length; n++) {
			System.out.println(arrayProfesor[n].tusDatos());
		}
	}
}
