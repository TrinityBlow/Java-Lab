package ejercicio3;

import ejercicio1.Estudiante;

public class EstudianteUniversitario extends Estudiante {
	private int ingreso;

	public EstudianteUniversitario(int ing){
		ingreso = ing;
	}
	
	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}
	
	
}
