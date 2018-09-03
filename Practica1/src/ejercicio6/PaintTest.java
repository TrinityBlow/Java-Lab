package ejercicio6;

public class PaintTest {

	public static void main(String[] args) {
		Paint painter= new Paint();
		painter.init();
		FiguraGeometrica[] paleta = painter.getPaleta();
		for(int x = 0; x < 4; x++){
			System.out.println(paleta[x].area());
			if (paleta[x] instanceof Circulo){
				System.out.println(((Circulo) paleta[x]).getRadio());
			}
			System.out.println();
		}
		for(int x = 0; x < 4; x++){
			paleta[x].dibujar();
		}
	}

}
