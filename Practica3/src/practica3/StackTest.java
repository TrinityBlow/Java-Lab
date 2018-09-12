package practica3;

import java.util.Iterator;

import practica3.Stack;

public class StackTest {

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

}
