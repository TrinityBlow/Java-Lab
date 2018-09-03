package ejercicio2;

public class Respuestas {
	int x;
	void unMetodoA(){
	System.out.println( "Un met. paquete " );
	}
	
	/*
	 * a) Gamma no puede acceder a las variables ni a los metodos, ya que estan protejidas solo pueden ser accedidas por las clases 
	 * de su mismo paquete o clases que extiendan de esa
	 * b) Beta puede acceder a esa variable y metodo ya que son publicas, y todos los elementos publicos pueden ser accedidos por cualquier
	 * clase sin ser del mismo paquete
	 * c) Beta no puede acceder, a cualquier metodo que no se le especifique el rango por default es package, y solo puede ser accedidos
	 * por las clases dentro del mismo paquete
	 * d) No solo las clases que esten ubicadas en el paquete de la clase pueden acceder a esas variables y metodos
	 * e) Si, las variables y los metodos protected son la forma en que java permite la herencia para que estos sean usada por las
	 * clases que las extiendan, o hijos llamadas en objetos, para que estas clases puedan heredar la funcionalidad de las clases
	 * que extiendan.
	 */
}
