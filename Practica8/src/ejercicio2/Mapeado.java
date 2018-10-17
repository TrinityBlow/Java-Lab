package ejercicio2;

@Archivo(nombre="AchivoMapeado.txt")
public class Mapeado {

	@AlmacenarAtributo
	private String valor = "Default1";
	
	@AlmacenarAtributo
	private Integer valor2=20;
	
	@AlmacenarAtributo
	private Float valor3=30.20f;
	
	//Metodos getters y setters

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Float getValor3() {
		return valor3;
	}

	public void setValor3(Float valor3) {
		this.valor3 = valor3;
	}
	
}
