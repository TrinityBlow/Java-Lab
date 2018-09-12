package practica3;

import java.util.ArrayList;
import java.util.Iterator;


public class Stack {

	private ArrayList<String> items;
	
	public Stack(){
		items = new ArrayList<String>();
	}
	
	public void push(String item){	
		items.add(item);
	}
	
	public String pop(){
		if (!items.isEmpty()){
			String devolver;
			devolver = items.get(items.size() - 1);
			items.remove(items.size() - 1);
			return devolver;
		}else{
			return null;
		}	
	}
	
	public boolean isEmpty(){
		return items.isEmpty();
	}
	
	public void finalize(){
		items.clear();
	}
	
	public StackIterator iterator(){
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<String>{

		private int pointer;
		
		public StackIterator(){
			pointer = items.size() - 1;
		}
		
		@Override
		public boolean hasNext() {
			if(pointer >= 0){
				return true;
			}else{
				return false;
			}
				
		}

		@Override
		public String next() {
			if(hasNext()){
				String item;
				item = items.get(pointer);
				pointer = pointer - 1;
				return item;
			}else{
				return null;
			}
		}


		
	}
	/*
	public static void main(String[] args){
		Stack stack = new Stack();
		String a = new String("asd");
		stack.push(a);
		a = new String("dsa");
		stack.push(a);
		a = new String("qwe");
		stack.push(a);
		StackIterator it = stack.iterator(); 
		while (it.hasNext()){
			System.out.println(it.next());
		}
		it = stack.new StackIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}*/

	/*
	 * El stack se puede recorrer por la cantidad de elementos que contiene y mientras se recorren los elementos se van eliminando
	 * 
	 * Depende la implementacion del iterator, si el iterator de stack es public se puede acceder desde el objeto con instancia.new
	 * Para evitar acceder desde otra clase si tiene que poner el acceso private.
	 */
}
