package ejercicio3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Corredor extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;

	private int runner = 0;
	private int end = 10,pos = 0;
	private String nombre;
	
	public Corredor(String nombre, int pos){
		super();
		this.nombre = nombre;
		this.pos = pos;
	}

	
	//pinta en el canvas la partitura correspondiente a los datos actuales
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawString(nombre, 10,25); 
        g2d.drawLine(20,20,25 + runner * 10,20);
//        while(it.hasNext()){
//        	point = it.next();
//          g2d.drawString(point.getSigno(), 33 + (rep * 18), point.getPos() + 5); 
//        	g2d.drawImage(charToPic.get(point.getNote()), 34 + (rep * 18) , point.getPos() - 25, this);
//        	if( (point.getPos() == 40) || ( point.getPos() == 160) ){
//                g2d.drawLine(37 + (rep * 18), point.getPos() , 55 + (rep * 18), point.getPos());
//        	}
//        	rep = rep + 1;
//        }
        
	}
	
	public void toggle() {
//		if(actualImage == null){
//			actualImage = paisaje;
//		}else{
//			actualImage = null;
//		}
		this.paintComponent(this.getGraphics());
	}


	@Override
	public void run() {
		while(runner < end){
			runner = runner + 1 ;
			paintComponent(getGraphics());
		}
	}
	
}
