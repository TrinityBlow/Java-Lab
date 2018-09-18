package musical;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.JPanel;

public class JPartitura extends JPanel {

	private BufferedImage actualImage = null;
	private static final long serialVersionUID = 1L;
	private int cantNotes = 0;
	private ArrayList<PartituraPoint> notas = new ArrayList<PartituraPoint>();
	private Hashtable<Character, BufferedImage> charToPic;

	
	public JPartitura(BufferedImage img, Hashtable<Character, BufferedImage> charToPic){
		super();
		this.actualImage = img;
		this.charToPic = charToPic;
	}

	//pinta en el canvas la partitura correspondiente a los datos actuales
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
        	g2d.drawImage(charToPic.get(point.getNote()), 34 + (rep * 18) , point.getPos() - 25, this);
        	if( (point.getPos() == 40) || ( point.getPos() == 160) ){
                g2d.drawLine(37 + (rep * 18), point.getPos() , 55 + (rep * 18), point.getPos());
        	}
        	rep = rep + 1;
        }
        
	}

	//agrega la siguiente nota y vuelve a dibujar el canvas
	protected void nextTune(int position, Character note,String signo){
		if(cantNotes < 20){
			notas.add(new PartituraPoint(new Integer(position), note,signo) );
			cantNotes = cantNotes + 1;
	        this.paintComponent(this.getGraphics());	
		}
	}

	//remueve la ultima nota y vuelve a dibujar el canvas
	protected void removeLastTune(){
		if(cantNotes > 0){
			notas.remove(notas.size() - 1);
			cantNotes = cantNotes - 1;
	        this.paintComponent(this.getGraphics());	
		}
	}
	
	//limpia las notas y vuelve a dibujar el canvas
	protected void limpiar() {
		cantNotes = 0;
		notas = new ArrayList<PartituraPoint>();
		this.paintComponent(this.getGraphics());
	}
	
	//devuelve un String del formato JFugue correspondiente al orden de la notas
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


	
	public ArrayList<PartituraPoint> getNotas(){
		return notas;
	}
	
	
	public void setImage(BufferedImage img){
		actualImage = img;
	}
	
	//representasion de la nota en un punto dado
	private class PartituraPoint {

		/*
		 * Clase dependiente de JPartitura, dependiendo de la posicion en pixeles devuelve un string JFugue con la nota representado
		 * en JPartitura
		 *   
		 */
		
		private Integer pos;
		private Character note;
		private String signo = "";
		
		public PartituraPoint(Integer pos, Character note, String signo){
			this.pos = pos;
			this.note = note;
			this.signo = signo;
		}
		
		public String posToTune(){
			String resultado;
			if( pos <= 40 ){
				resultado = "A" + this.signo + "6";
			}else if( pos <= 50 ){
				resultado = "G" + this.signo + "6";
			}else if( pos <= 60 ){
				resultado = "F" + this.signo + "6";
			}else if( pos <= 70 ){
				resultado = "E" + this.signo + "6";
			}else if( pos <= 80 ){
				resultado = "D" + this.signo + "6";
			}else if( pos <= 90 ){
				resultado = "C" + this.signo + "6";
			}else if( pos <= 100 ){
				resultado = "B" + this.signo + "5";
			}else if( pos <= 110 ){
				resultado = "A" + this.signo + "5";
			}else if( pos <= 120 ){
				resultado = "G" + this.signo + "5";
			}else if( pos <= 130 ){
				resultado = "F" + this.signo + "5";
			}else if( pos <= 140 ){
				resultado = "E" + this.signo + "5";
			}else if( pos <= 150 ){
				resultado = "D" + this.signo + "5";
			}else{
				resultado = "C" + this.signo + "5";
			}
			return resultado  + note;
		}
		
		public String getSigno(){
			return signo;
		}
		
		public Integer getPos() {
			return pos;
		}
		
		public Character getNote(){
			return note;
		}
		
	}	


}
