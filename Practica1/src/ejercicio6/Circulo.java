package ejercicio6;

public class Circulo extends FiguraGeometrica {
	private int radio;
	
	public Circulo(){
		
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
