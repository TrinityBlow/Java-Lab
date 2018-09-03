package ejercicio3;

import ejercicio1.Estudiante;

public class EstudianteSecundario extends Estudiante {
	private int materias;
	private float promedio;
	
	public EstudianteSecundario(int mat, float prom){
		materias = mat;
		promedio = prom;
	}
	
	public int getMaterias() {
		return materias;
	}
	public void setMaterias(int materias) {
		this.materias = materias;
	}
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	
}
