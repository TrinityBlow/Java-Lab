package ejercicio1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Materia<E> {

	private TreeSet<E> tipo;
	
	
	Materia(){
		tipo = new TreeSet<E>();
	}
	
	Materia(Comparator<E> comp){
		tipo = new TreeSet<E>(comp);
	}
	
	public void agregaAlumno( E alumno){
		tipo.add(alumno);
	}
	
	public SortedSet<E> getAlumnos(){
		return tipo;
	}
	
}
