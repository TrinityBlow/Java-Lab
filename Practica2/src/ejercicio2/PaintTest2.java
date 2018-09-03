package ejercicio2;

import java.util.Arrays;

public class PaintTest2 {

	public static void main(String[] args) {
		Paint2 painter= new Paint2();
		painter.init();
		FiguraGeometrica2[] paleta = painter.getPaleta();
		for(int x = 0; x < 4; x++){
			System.out.println(paleta[x].area());
			if (paleta[x] instanceof Circulo2){
				System.out.println(((Circulo2) paleta[x]).getRadio());
			}
			System.out.println();
		}
		for(int x = 0; x < 4; x++){
			paleta[x].dibujar();
		}
		System.out.println();
		Arrays.sort(paleta);
		for(int x = 0; x < 4; x++){
			paleta[x].dibujar();
		}
	}

}
