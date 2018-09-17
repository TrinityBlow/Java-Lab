package musical;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPartitura extends JPanel {

	private BufferedImage actualImage = null;
	private static final long serialVersionUID = 1L;
	private int lastLine = -1,cantLines = 0;

	public void setImage(BufferedImage img){
		actualImage = img;
	}
	
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawImage(actualImage, 0, 60, this);
        g2d.drawLine(0, 140 , 400, 140);
        g2d.drawLine(0, 120 , 400, 120);
        g2d.drawLine(0, 100 , 400, 100);
        g2d.drawLine(0, 80 , 400, 80);
        g2d.drawLine(0, 60 , 400, 60);
	}
	
	public JPartitura(BufferedImage img){
		super();
		actualImage = img;
	}
	
	private class JCustomLine extends JPanel{
		
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g){
			super.paintComponent(g);

	        Graphics2D g2d = (Graphics2D) g.create();
	        g2d.setColor(Color.RED);
	        g2d.drawLine(0, this.getHeight() / 2, 150, this.getHeight() / 2);
	        g2d.dispose();
		}
	}


}
