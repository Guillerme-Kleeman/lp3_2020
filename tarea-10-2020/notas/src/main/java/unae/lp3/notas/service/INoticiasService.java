package unae.lp3.notas.service;

import java.util.List;

import unae.lp3.notas.model.Noticia;

public interface INoticiasService {
	public List<Noticia> getNoticias();
	public Noticia getNoticia(int id);
	public void insertNoticia(Noticia noticia);
	public Noticia saveNoticia(Noticia noticia);
	public void deleteNoticia(int id);
}
