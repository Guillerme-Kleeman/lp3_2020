package peliculas.repository;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import peliculas.model.Peliculas;

@Transactional
public interface PeliculasRepository extends CrudRepository<Peliculas, Integer>{

}
