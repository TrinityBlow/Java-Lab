package entrega3;

import java.util.Date;

public class Comentario {

	private String comentario;
	private String respuesta;
	private Date fechaRespuesta;
	private Date fechaPregunta;
	private Publicacion publicacion;
	private Usuario creador;
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Date getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
	public Date getFechaPregunta() {
		return fechaPregunta;
	}
	public void setFechaPregunta(Date fechaPregunta) {
		this.fechaPregunta = fechaPregunta;
	}
	public Publicacion getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	public Usuario getCreador() {
		return creador;
	}
	public void setCreador(Usuario creador) {
		this.creador = creador;
	}
	
	
	
	
}
