package musical;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

public class JPartitura extends JPanel {

	private BufferedImage actualImage = null;
	private static final long serialVersionUID = 1L;
	private int cantNotes = 0;
	private ArrayList<PartituraPoint> notas = new ArrayList<PartituraPoint>();

	public ArrayList<PartituraPoint> getNotas(){
		return notas;
	}
	
	public void setImage(BufferedImage img){
		actualImage = img;
	}
	
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        Iterator<PartituraPoint> it = notas.iterator();
        PartituraPoint point;
        int rep = 0;
        g2d.drawImage(actualImage, 0, 60, this);
        g2d.drawLine(0, 140 , 400, 140);
        g2d.drawLine(0, 120 , 400, 120);
        g2d.drawLine(0, 100 , 400, 100);
        g2d.drawLine(0, 80 , 400, 80);
        g2d.drawLine(0, 60 , 400, 60);
        g2d.drawLine(30, 60 , 30, 140);
        g2d.drawLine(32, 60 , 32, 140);
        while(it.hasNext()){
        	point = it.next();
            g2d.drawString(point.getSigno(), 33 + (rep * 18), point.getPos() + 5); 
        	g2d.drawImage(point.getImg(), 34 + (rep * 18) , point.getPos() - 25, this);
        	if( (point.getPos() == 40) || ( point.getPos() == 160) ){
                g2d.drawLine(37 + (rep * 18), point.getPos() , 55 + (rep * 18), point.getPos());
        	}
        	rep = rep + 1;
        }
        
	}
	
	public JPartitura(BufferedImage img){
		super();
		actualImage = img;
	}

	protected void nextTune(int position, BufferedImage actualNote, Character note,String signo){
		if(cantNotes < 20){
			notas.add(new PartituraPoint(new Integer(position) , actualNote, note,signo) );
			cantNotes = cantNotes + 1;
	        this.paintComponent(this.getGraphics());	
		}
	}
	
	protected void removeLastTune(){
		if(cantNotes > 0){
			notas.remove(notas.size() - 1);
			cantNotes = cantNotes - 1;
	        this.paintComponent(this.getGraphics());	
		}
	}
	
	protected String getStringJFugue(){
        Iterator<PartituraPoint> it = notas.iterator();
        PartituraPoint point;
        String cadenaJFugue = "";
        while(it.hasNext()){
        	point = it.next();
        	cadenaJFugue = cadenaJFugue + point.posToTune() + " ";
        	
        }
		return cadenaJFugue;
	}

	protected void limpiar() {
		cantNotes = 0;
		notas = new ArrayList<PartituraPoint>();
		this.paintComponent(this.getGraphics());
	}



}
