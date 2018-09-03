package ejercicio2;

public abstract class FiguraGeometrica2 implements Comparable<FiguraGeometrica2> {
	private String color;
	
	public FiguraGeometrica2(){
		
	}
	
	public abstract void dibujar();
	public abstract int area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int compareTo(FiguraGeometrica2 fig){
		if (this.area() > fig.area())
			return 1;
		else if (this.area() < fig.area())
			return -1;
		else
			return 0;
	}
	
}
