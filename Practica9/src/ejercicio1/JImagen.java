package ejercicio1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class JImagen extends JPanel {

	private BufferedImage actualImage = null, paisaje;
	private static final long serialVersionUID = 1L;

	
	public JImagen(BufferedImage paisaje){
		super();
		this.paisaje = paisaje;
		actualImage = paisaje;
	}

	//pinta en el canvas la partitura correspondiente a los datos actuales
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawImage(actualImage, 10, 60, this);
        
//        while(it.hasNext()){
//        	point = it.next();
//            g2d.drawString(point.getSigno(), 33 + (rep * 18), point.getPos() + 5); 
//        	g2d.drawImage(charToPic.get(point.getNote()), 34 + (rep * 18) , point.getPos() - 25, this);
//        	if( (point.getPos() == 40) || ( point.getPos() == 160) ){
//                g2d.drawLine(37 + (rep * 18), point.getPos() , 55 + (rep * 18), point.getPos());
//        	}
//        	rep = rep + 1;
//        }
        
	}

	public void toggle() {
		if(actualImage == null){
			actualImage = paisaje;
		}else{
			actualImage = null;
		}
		this.paintComponent(this.getGraphics());
	}
	
}
