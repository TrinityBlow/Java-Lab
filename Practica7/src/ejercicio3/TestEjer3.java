package ejercicio3;

public class TestEjer3 {

	public static void main(String[] args) {
		System.out.println("Test3");
		try {
			System.out.println("Primer try");
			try {
				throw new Exception();
			} finally {
				System.out.println("Finally del 2 try");
			}
		} catch (Exception e) {
			System.out.println("Se capturo la Excepcion ex del 1 Primer try");
		} finally {
			System.out.println("Finally del 1 try");
		}
	}
	
//	Test3
//	Primer try
//	Finally del 2 try   (cuando el programa sale del try, auque sea para propagar la excepcion, este siempre ejecuta la clausula finally)
//	Se capturo la Excepcion ex del 1 Primer try
//	Finally del 1 try
}
