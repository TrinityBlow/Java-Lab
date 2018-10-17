package ejercicio1;

import java.util.Comparator;

public class Alumno implements Comparable<Alumno> {

	private Integer legajo;
	private String apellido;
	private String nombre;
	private String dni;
	
	
	public Alumno(Integer legajo, String apellido, String nombre, String dni) {
		super();
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public int compareTo(Alumno alumno) {
		// TODO Auto-generated method stub
		return legajo.compareTo(alumno.getLegajo());
	}
	
	
	public static Comparator<Alumno> compareLegajo(){
		return new Comparator<Alumno>(){

			@Override
			public int compare(Alumno o1, Alumno o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		};
	}
	
	public static Comparator<Alumno> compareApeNom(){
		return new Comparator<Alumno>(){

			@Override
			public int compare(Alumno o1, Alumno o2) {
				// TODO Auto-generated method stub
				if(o1.getApellido().compareTo(o2.getApellido()) == 0){
					return o1.getNombre().compareTo(o2.getNombre());
				} else{
					return o1.getApellido().compareTo(o2.getApellido());
				}
			}
			
		};
	}
	
	public static Comparator<Alumno> compareDni(){
		return new Comparator<Alumno>(){

			@Override
			public int compare(Alumno o1, Alumno o2) {
				// TODO Auto-generated method stub
				return o1.getDni().compareTo(o2.getDni());
			}
			
		};
	}
	
	
	
	
}
