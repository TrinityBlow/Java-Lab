package ejercicio1;

public class Estudiante {

	String apellido;
	String nombre;
	String legajo;
	StringBuffer buffer;
	
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
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	@Override
	public String toString() {
		buffer = new StringBuffer();
		buffer.append("Estudiante ");
		buffer.append(apellido);
		buffer.append(" ");
		buffer.append(nombre);
		buffer.append(", ");
		buffer.append(legajo);
		return buffer.toString();
	}
	
	
	
}
