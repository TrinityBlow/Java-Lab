package ejercicio3;

import java.util.ArrayList;

public class TestHash {

	public static void main(String[] args) {
		HashSetAgregadosComp<Integer> test = new HashSetAgregadosComp<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		test.addAll(list);
		System.out.println(test.getCantidadAgregados​());
		
	}

	/*
	 * La clase HashSetAgregados en el metodo addAll() hace de mas la suma, cada vez que se usa addAll() suma el tamaño del arreglo
	 * a la cantidad de agregados y despues usa el addAll() del super y este addAll() recorre la coleccion mandada y usa add por cada
	 * elemento y cuando eso pasa utiliza el add() de la nueva clase y vuelve a sumar la cantidad de elementos, esto se arregla
	 * simplemente no sumando en el addAll() de la clase creada.
	 * */
	/*
	 * Implementar el HashSet con composicion proporsiona la ventaja de no tener resultados inesperados por culpa de la ocultacion
	 * y sobreescribir metodos y variables. Ya que no se comparte las variables y los metodos esto permite una mayor aislacion y
	 * ocultamiento para no cometer error y poder programar mas adecuadamente al estilo necesario
	 */
	
}
