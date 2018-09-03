package ejercicio2;

public class Rectangulo2 extends FiguraGeometrica2 {
	private int alto = 1;
	private int ancho = 1;
	
	public Rectangulo2(){
		
	}
	
	public Rectangulo2(int alt, int anch){
		alto = alt;
		ancho = anch;
	}
	
	public void dibujar(){
		System.out.println("se dibuja un rectangulo de alto: " + alto + ", ancho: " + ancho + ", y de color: " + super.getColor());
	}
	
	public int area(){
		return alto * ancho;
	}
}
