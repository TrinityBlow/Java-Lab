package ejercicio2;

public class Paint2 {
	private FiguraGeometrica2[] paleta;
	
	public Paint2(){
		paleta = new FiguraGeometrica2[4];
	}

	public FiguraGeometrica2[] getPaleta() {
		return paleta;
	}

	public void setPaleta(FiguraGeometrica2[] paleta) {
		this.paleta = paleta;
	}
	
	public void init(){
		Rectangulo2 rect1 = new Rectangulo2(2,3);
		rect1.setColor("verde");
		paleta[0] = rect1;
		Circulo2 circ1 = new Circulo2();
		circ1.setColor("azul");
		circ1.setRadio(2);
		paleta[1] = circ1;
		Rectangulo2 rect2 = new Rectangulo2(4,10);
		rect2.setColor("rojo");
		paleta[2] = rect2;
		Circulo2 circ2 = new Circulo2();
		circ2.setColor("amarrillo");
		circ2.setRadio(3);
		paleta[3] = circ2;
	}
}
