package ejercicio6;

public class Paint {
	private FiguraGeometrica[] paleta;
	
	public Paint(){
		paleta = new FiguraGeometrica[4];
	}

	public FiguraGeometrica[] getPaleta() {
		return paleta;
	}

	public void setPaleta(FiguraGeometrica[] paleta) {
		this.paleta = paleta;
	}
	
	public void init(){
		Rectangulo rect1 = new Rectangulo(2,3);
		rect1.setColor("verde");
		paleta[0] = rect1;
		Circulo circ1 = new Circulo();
		circ1.setColor("azul");
		circ1.setRadio(2);
		paleta[1] = circ1;
		Rectangulo rect2 = new Rectangulo(4,10);
		rect2.setColor("rojo");
		paleta[2] = rect2;
		Circulo circ2 = new Circulo();
		circ2.setColor("amarrillo");
		circ2.setRadio(3);
		paleta[3] = circ2;
	}
}
