package unae.lp3.notas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unae.lp3.notas.model.Categoria;
import unae.lp3.notas.repository.CategoriasRepo;
@Service
public class CategoriasServiceImpl implements ICategoriasService {
	@Autowired
	public CategoriasRepo  categoriasRepo;

	@Override
	public List<Categoria> getCategorias() {
		// TODO Auto-generated method stub
		List<Categoria> lista= (List<Categoria>) categoriasRepo.findAll();
		return lista;
	}

	@Override
	public Categoria getCategoria(int id) {
		Optional<Categoria> t=categoriasRepo.findById(id);
		Categoria nota=t.get();
		return nota;
	}


	@Override
	public void insertCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriasRepo.save(categoria);
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriasRepo.save(categoria);
	}

	@Override
	public void deleteCategoria(int id) {
		categoriasRepo.deleteById(id);;

		// TODO Auto-generated method stub
		
	}






}
