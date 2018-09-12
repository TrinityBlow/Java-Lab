package ejercicio3;

import java.util.AbstractSet;
import java.util.Iterator;

public class StringConverterSet<E> extends AbstractSet<E> {

	@Override
	public Iterator<E> iterator() {
		return new IteratorStringAdapter();
	}

	@Override
	public int size() {
		return 0;
	}
	
	private final class IteratorStringAdapter  implements Iterator<E>{

		@Override
		public boolean hasNext() {
			System.out.println(toArray());
			return true;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
