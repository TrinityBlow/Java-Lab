package entrega3;

import java.util.ArrayList;

public class Categoria {

	private String tipo;
	private ArrayList<Cartelera> listaDeCarteleras;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList<Cartelera> getListaDeCarteleras() {
		return listaDeCarteleras;
	}
	public void setListaDeCarteleras(ArrayList<Cartelera> listaDeCarteleras) {
		this.listaDeCarteleras = listaDeCarteleras;
	}
	
	
	
}
