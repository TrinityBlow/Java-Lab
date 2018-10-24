package entrega3;

import java.util.ArrayList;
import java.util.Date;

public class Cartelera {

	private String nombre;
	private Date fecha;
	private ArrayList<Publicacion> listaDePublicaciones;
	private Categoria categoria;
	private ArrayList<Alumno> alumnosInterezados;
	private ArrayList<Usuario> miembros;
	private Administrador creador;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public ArrayList<Publicacion> getListaDePublicaciones() {
		return listaDePublicaciones;
	}
	public void setListaDePublicaciones(ArrayList<Publicacion> listaDePublicaciones) {
		this.listaDePublicaciones = listaDePublicaciones;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Alumno> getAlumnosInterezados() {
		return alumnosInterezados;
	}
	public void setAlumnosInterezados(ArrayList<Alumno> alumnosInterezados) {
		this.alumnosInterezados = alumnosInterezados;
	}
	public ArrayList<Usuario> getMiembros() {
		return miembros;
	}
	public void setMiembros(ArrayList<Usuario> miembros) {
		this.miembros = miembros;
	}
	public Administrador getCreador() {
		return creador;
	}
	public void setCreador(Administrador creador) {
		this.creador = creador;
	}
	
	
	
}
