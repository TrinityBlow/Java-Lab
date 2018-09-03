package ejercicio1;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estu1 = new Estudiante();
		estu1.setApellido("algo1");
		estu1.setNombre("mas1");
		estu1.setLegajo("sarsa1");
		Estudiante estu2 = new Estudiante();
		estu2.setApellido("algo2");
		estu2.setNombre("mas2");
		estu2.setLegajo("sarsa2");
		Estudiante estu3 = new Estudiante();
		estu3.setApellido("algo3");
		estu3.setNombre("mas3");
		estu3.setLegajo("sarsa3");
		Estudiante estu4 = new Estudiante();
		estu4.setApellido("algo4");
		estu4.setNombre("mas4");
		estu4.setLegajo("sarsa4");
		Estudiante estu5 = new Estudiante();
		estu5.setApellido("algo5");
		estu5.setNombre("mas5");
		estu5.setLegajo("sarsa5");
		Estudiante[] estus = new Estudiante[5];
		estus[0] = estu1;
		estus[1] = estu2;
		estus[2] = estu3;
		estus[3] = estu4;
		estus[4] = estu5;
		for(int x = 0; x < 5 ;x++ ){
			System.out.print(estus[x].toString());
			System.out.print("\n");
		}
		estu1.equals(estu2);
		if(estu1.equals(estu2)){
			System.out.print("1");
		}else{
			System.out.print("2");	
		}
	}
}

//El metodo default de toString() de un objeto muestra la id de ese objeto ubicada en memoria
//El metodo equals el cual compara los objetos usa un metodo llamado hashCode() para poder saber si la instancia del metodo son iguales, este metodo se puede cambiar para poder hacer tipos de comparaciones diferentes.
//Cuando a un objeto se compara con == , java se fija si son la misma instancia, osea si son el mismo objeto en memoria.
//Cuando se crea un archivo jar hay que espedificar en el manifest, el cual todos los archivos jar tiene, cual es la clase que contiene el main.

//Para poder ejecutar la aplicacion fuera del entorno del trabajo se puede usar el cmd, para poder ejecutar el programa hay que compilarlo, 
//para esto hay que agregar el compilador de java, javac, haciendo uso de las path para el SO pueda ubicar el compilador que se encuentra en el jdk
//Otro paso importante son los classpath con el cual java puede ubicar donde se encuentran todos los .class para poder correr el programa
