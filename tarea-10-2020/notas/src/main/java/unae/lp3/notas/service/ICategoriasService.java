package unae.lp3.notas.service;

import java.util.List;

import unae.lp3.notas.model.Categoria;

public interface ICategoriasService {
	public List<Categoria> getCategorias();
	public Categoria getCategoria(int id);
	public void insertCategoria(Categoria categoria);
	public Categoria saveCategoria(Categoria categoria);
	public void deleteCategoria(int id);
}
