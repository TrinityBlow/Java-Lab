package entrega3;

import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private String apellido;
	private String password;
	private String email;
	private Rol rol;
	private ArrayList<Cartelera> cartelerasPertenecientes;
	private ArrayList<Publicacion> listaDePublicaciones;
	private ArrayList<Comentario> listaDeComentarios;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public ArrayList<Cartelera> getCartelerasPertenecientes() {
		return cartelerasPertenecientes;
	}
	public void setCartelerasPertenecientes(ArrayList<Cartelera> cartelerasPertenecientes) {
		this.cartelerasPertenecientes = cartelerasPertenecientes;
	}
	public ArrayList<Publicacion> getListaDePublicaciones() {
		return listaDePublicaciones;
	}
	public void setListaDePublicaciones(ArrayList<Publicacion> listaDePublicaciones) {
		this.listaDePublicaciones = listaDePublicaciones;
	}
	public ArrayList<Comentario> getListaDeComentarios() {
		return listaDeComentarios;
	}
	public void setListaDeComentarios(ArrayList<Comentario> listaDeComentarios) {
		this.listaDeComentarios = listaDeComentarios;
	}

	
	
}

