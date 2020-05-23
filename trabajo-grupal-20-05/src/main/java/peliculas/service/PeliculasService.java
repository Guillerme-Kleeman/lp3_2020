package peliculas.service;

import peliculas.model.Peliculas;
import peliculas.repository.PeliculasRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("peliculasService")
public class PeliculasService {
	
	@Autowired
	PeliculasRepository peliculasRepository;
	
	public Iterable<Peliculas> listarPeliculas(){
		return peliculasRepository.findAll();
	}

}
