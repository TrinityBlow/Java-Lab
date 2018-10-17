package ejercicio4;

public class Encuentro extends Partido implements Tormenta {
	
	Encuentro() throws 	Lluvia,
						FutbolException{
							System.out.println("1");
						}
	Encuentro (String fecha) throws Falta,
						FutbolException{
							System.out.println("2");
						}
	void penal() throws Mano{
		System.out.println("3");
	}  							// las excepciones no se pueden extender, como Partido no tiene la excepcion o una superclase de esa, no
								// se le puede agregar una excepcion por problemas de compatibilidad
	
	public void evento() throws Lluvia{
		System.out.println("4");
	}  //mismo problema
	public void diluvio() throws Lluvia{
		System.out.println("5");
	}
//	public void evento(){}
	void jugada() throws Mano{
		System.out.println("12");
		throw new Mano();
	}
	
	public static void main (String[] args) {
		try {
			Encuentro enc = new Encuentro();
			enc.jugada();
		} catch(Mano e) {
			System.out.println("6");
		} catch(Lluvia e) {
			System.out.println("7");
		} catch(FutbolException e) {
			try {
			Partido par = new Encuentro();
			par.jugada();
			} catch(EquipoIncompleto e1) {
				System.out.println("8");
			} catch(Falta e1) {
				System.out.println("9");
			} catch(Lluvia e1) {
				System.out.println("10");
			} catch(FutbolException e1) {
				System.out.println("11");
			} // el parametro e esta siendo utilizado por FurbolException,
			
		}
	}
}
