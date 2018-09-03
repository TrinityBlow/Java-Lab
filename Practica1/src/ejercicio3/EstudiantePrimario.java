package ejercicio3;

import ejercicio1.Estudiante;

public class EstudiantePrimario extends Estudiante {
	private int ausensias;
	private boolean repitio;
	
	public EstudiantePrimario(int aus, boolean rep){
		ausensias = aus;
		repitio = rep;
	}
	
	public int getAusensias() {
		return ausensias;
	}
	public void setAusensias(int ausensias) {
		this.ausensias = ausensias;
	}
	public boolean isRepitio() {
		return repitio;
	}
	public void setRepitio(boolean repitio) {
		this.repitio = repitio;
	}
	
	
}
