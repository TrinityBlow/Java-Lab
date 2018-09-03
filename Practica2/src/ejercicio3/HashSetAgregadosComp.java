package ejercicio3;

import java.util.Collection;
import java.util.HashSet;

public class HashSetAgregadosComp<E> {
	
	 private HashSet<E> set;
	 private int cantidadAgregados = 0;
     
	 public HashSetAgregadosComp() {		
		 this.set = new HashSet<E>();
	 }
	 
	 public HashSetAgregadosComp(int initCap, float loadFactor) {
		 this.set = new HashSet<E>(initCap, loadFactor);
	 }
	 
	 public boolean add(E e) {
		 cantidadAgregados++;
	 	return this.set.add(e);
	 }
	 
	 public boolean addAll(Collection<? extends E> c) {
		 cantidadAgregados += c.size();
		 return this.set.addAll(c);
	 }
	 
	 public int getCantidadAgregados​() {
		 return cantidadAgregados;
	 }
}
