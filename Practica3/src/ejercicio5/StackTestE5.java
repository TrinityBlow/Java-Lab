package ejercicio5;

import java.util.Iterator;

import practica3.Stack;

public class StackTestE5 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		String a = new String("asd");
		stack.push(a);
		a = new String("dsa");
		stack.push(a);
		a = new String("qwe");
		stack.push(a);
		Iterator<String> it = stack.iterator(); 
		while (it.hasNext()){
			System.out.println(it.next());
		}
		it = stack.iterator(); 
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}

	/*
	 * Mayormente las clases anonimas se usan para ocultar implementacion, en este caso se oculta que Iterator<String> fue modificado
	 * para que funcione como un stack sin que sepa el cliente. Tambien para poder instanciar interfaces sin la necesidad de crear
	 * una nueva clase.
	 * 
	 * Las clases anonimas tecnicamente no tienen un constructor usan bloque de inicializacion que puede ser usado como constructor, 
	 * este bloque es limitado ya que solo puede haber 1,no puede haber sobrecarga de constructores, y los parametros tienen que
	 * ser definidos en la clase que lo definio ya que no pueden ser pasados como parametros
	 * 
	 */
	
}
