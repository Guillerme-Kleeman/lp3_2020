package unae.lp3.notas.service;

import java.util.List;

import unae.lp3.notas.model.Nota;

public interface INotasService {
	public List<Nota> getNotas();
	public Nota getNota(int notaId);
	public void insertNota(Nota nota);
	public Nota saveNota(Nota nota);
	public void deleteNota(int notaId);
}
