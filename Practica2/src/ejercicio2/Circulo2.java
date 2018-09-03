package ejercicio2;


public class Circulo2 extends FiguraGeometrica2 {
	private int radio;
	
	public Circulo2(){
		
	}
	
	public void dibujar(){
		System.out.println("se dibuja un circulo de radio: " + radio + ", y de color: " + super.getColor());
	}
	
	public int area(){
		return (int)(Math.PI * Math.pow(radio, 2));
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
}
