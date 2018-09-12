package ejercicio6;

import java.util.Comparator;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private Integer materiasAprobadas;
	private Integer edad;
	private String legajo;
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public Integer getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	
	public Comparator<Estudiante> materiasApAsc(){
		return new Comparator<Estudiante>(){

			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				return arg0.getMateriasAprobadas().compareTo(arg1.getMateriasAprobadas());
			}
			
		};
	}
	
	public Comparator<Estudiante> edadDesc(){
		return new Comparator<Estudiante>(){

			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				return -arg0.getEdad().compareTo(arg1.getEdad());
			}
			
		};
	}
	
	public Comparator<Estudiante> legajoAsc(){
		return new Comparator<Estudiante>(){

			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				return arg0.getLegajo().compareTo(arg1.getLegajo());
			}
		};
	}
	
	public Comparator<Estudiante> nomApeDesc(){
		return new Comparator<Estudiante>(){

			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				int result = -arg0.getNombre().compareToIgnoreCase(arg1.getNombre());
				if (result != 0){
					return result;
				}else{
					return -arg0.getApellido().compareToIgnoreCase(arg1.getApellido());
				}
			}
			
		};
	}
	
}
