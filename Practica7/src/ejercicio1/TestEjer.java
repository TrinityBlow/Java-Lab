package ejercicio1;


public class TestEjer {
	
	@SuppressWarnings("serial")
	class Excepcion1 extends Exception {}

	@SuppressWarnings("serial")
	class Excepcion2 extends Excepcion1 {}
	
	public static void main(String[] args) {
		TestEjer a = new TestEjer();
		
		try {
			throw a.new Excepcion2();
		} catch(Excepcion1 e1) {
			System.out.println("Se capturó la Excepción1");
		} //catch( Excepcion2 e2) {
//			System.out.println("Se capturó la Excepción2");
//		}
	}
	
	//como Excepcion1 este primero en la lista de catch nunca va a poder entrar por el catch Excepcion2 
	//ya que todas las excepciones de Excepciones2 van a ser capturadas por Excepcion1 ya que la extiende
	
	//para solucionar esto hay que invertir el orden o eliminar el catch de Excepcion2

}
