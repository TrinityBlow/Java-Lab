package entrega3;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class Publicacion {

	private String titulo;
	private String nota;
	private boolean comHabilitado;
	private Date fecha;
	private Image imagen;
	private Cartelera cartelera;
	private ArrayList<Comentario> listaDeComentarios;
	private Usuario creador;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public boolean isComHabilitado() {
		return comHabilitado;
	}
	public void setComHabilitado(boolean comHabilitado) {
		this.comHabilitado = comHabilitado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Image getImagen() {
		return imagen;
	}
	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	public Cartelera getCartelera() {
		return cartelera;
	}
	public void setCartelera(Cartelera cartelera) {
		this.cartelera = cartelera;
	}
	public ArrayList<Comentario> getListaDeComentarios() {
		return listaDeComentarios;
	}
	public void setListaDeComentarios(ArrayList<Comentario> listaDeComentarios) {
		this.listaDeComentarios = listaDeComentarios;
	}
	public Usuario getCreador() {
		return creador;
	}
	public void setCreador(Usuario creador) {
		this.creador = creador;
	}
	
	
	
	
	
}
