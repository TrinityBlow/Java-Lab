package ejercicio2;


public class InnerStatic {
	
	static double PI = 3.1416;
	
	static class Circulo{
		
		static double radio = 1;
		
		static void cambiarRadio(double rad){
			radio = rad;
		}
		
		static double getArea(){
			double a = PI * java.lang.Math.pow(radio, 2);
			System.out.println("El area es: " + a);
			return a;
		}
		
		static double getLongitudCircunsferencia(){
			double l = 2 * PI * radio;
			System.out.println("La longitud es: " + l);
			return l;
		}	
	}
	
}
