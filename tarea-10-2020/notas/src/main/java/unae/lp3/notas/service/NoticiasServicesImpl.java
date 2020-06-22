package unae.lp3.notas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unae.lp3.notas.model.Noticia;
import unae.lp3.notas.repository.NoticiasRepo;
@Service
public class NoticiasServicesImpl implements INoticiasService {
	@Autowired
	public NoticiasRepo  notirepo;

	@Override
	public List<Noticia> getNoticias() {
		// TODO Auto-generated method stub
		List<Noticia> lista= (List<Noticia>) notirepo.findAll();
		return lista;
	}

	@Override
	public Noticia getNoticia(int id) {
		Optional<Noticia> t=notirepo.findById(id);
		Noticia nota=t.get();
		return nota;
	}


	@Override
	public void insertNoticia(Noticia noticia) {
		// TODO Auto-generated method stub
		notirepo.save(noticia);
	}

	@Override
	public Noticia saveNoticia(Noticia noticia) {
		// TODO Auto-generated method stub
		return notirepo.save(noticia);
	}

	@Override
	public void deleteNoticia(int id) {
		notirepo.deleteById(id);;

		// TODO Auto-generated method stub
		
	}






}
