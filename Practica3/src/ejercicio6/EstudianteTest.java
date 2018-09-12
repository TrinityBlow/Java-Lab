package ejercicio6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EstudianteTest {

	public static void main(String[] args) {
		Estudiante[] ordenar = new Estudiante[4];
		Estudiante a1 = new Estudiante();
		Estudiante a2 = new Estudiante();
		Estudiante a3 = new Estudiante();
		Estudiante a4 = new Estudiante();
		a1.setNombre("A1");
		a1.setApellido("P1");
		a1.setMateriasAprobadas(4);
		a1.setEdad(18);
		a1.setLegajo("3324/4");;
		a2.setNombre("A2");
		a2.setApellido("P1");
		a2.setMateriasAprobadas(2);
		a2.setEdad(20);
		a2.setLegajo("4324/4");;
		a3.setNombre("A3");
		a3.setApellido("E2");
		a3.setMateriasAprobadas(3);
		a3.setEdad(40);
		a3.setLegajo("5324/4");;
		a4.setNombre("A2");
		a4.setApellido("P5");
		a4.setMateriasAprobadas(8);
		a4.setEdad(33);
		a4.setLegajo("2324/4");;
		ordenar[0] = a1;
		ordenar[1] = a2;
		ordenar[2] = a3;
		ordenar[3] = a4;
		int x;
		for(x = 0;x < 4; x++){
			System.out.println(ordenar[x].getNombre() + "|" + ordenar[x].getApellido() + "|" + ordenar[x].getMateriasAprobadas() + "|" + ordenar[x].getEdad() + "|" + ordenar[x].getLegajo());
		}
		System.out.println();
		Arrays.sort(ordenar,a1.materiasApAsc());
		for(x = 0;x < 4; x++){
			System.out.println(ordenar[x].getNombre() + "|" + ordenar[x].getApellido() + "|" + ordenar[x].getMateriasAprobadas() + "|" + ordenar[x].getEdad() + "|" + ordenar[x].getLegajo());
		}
		System.out.println();
		Arrays.sort(ordenar,a1.edadDesc());
		for(x = 0;x < 4; x++){
			System.out.println(ordenar[x].getNombre() + "|" + ordenar[x].getApellido() + "|" + ordenar[x].getMateriasAprobadas() + "|" + ordenar[x].getEdad() + "|" + ordenar[x].getLegajo());
		}
		System.out.println();
		Arrays.sort(ordenar,a1.legajoAsc());
		for(x = 0;x < 4; x++){
			System.out.println(ordenar[x].getNombre() + "|" + ordenar[x].getApellido() + "|" + ordenar[x].getMateriasAprobadas() + "|" + ordenar[x].getEdad() + "|" + ordenar[x].getLegajo());
		}
		System.out.println();
		Arrays.sort(ordenar,a1.nomApeDesc());
		for(x = 0;x < 4; x++){
			System.out.println(ordenar[x].getNombre() + "|" + ordenar[x].getApellido() + "|" + ordenar[x].getMateriasAprobadas() + "|" + ordenar[x].getEdad() + "|" + ordenar[x].getLegajo());
		}
	}

}
