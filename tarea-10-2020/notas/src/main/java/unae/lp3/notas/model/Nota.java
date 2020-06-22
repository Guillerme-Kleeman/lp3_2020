package unae.lp3.notas.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="notes")
public class Nota {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="title")
	private String titulo;
	@Column(name="content")
	private String contenido;
	@Column(name="date")
	private Date fecha;
	@Column(name="obs")
	private String obs;
/*	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	} */
	
	
	public Nota( String titulo, String contenido) {
		super();
		//this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
		//this.fecha= new Date.;
	}
	public Nota() {
	super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + "]";
	}
		

	
	
}
