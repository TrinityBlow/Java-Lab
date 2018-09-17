package musical;

import java.awt.image.BufferedImage;

public class PartituraPoint {

	private Integer pos;
	private BufferedImage img;
	private Character note;
	private String signo = "";
	
	public PartituraPoint(Integer pos, BufferedImage img, Character note, String signo){
		this.pos = pos;
		this.img = img;
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
	public void setPos(Integer pos) {
		this.pos = pos;
	}
	public BufferedImage getImg() {
		return img;
	}
	public void setImg(BufferedImage img) {
		this.img = img;
	}
	
	
	
}
