package unae.lp3.notas.repository;

import org.springframework.data.repository.CrudRepository;

import unae.lp3.notas.model.Noticia;

public interface NoticiasRepo extends CrudRepository<Noticia, Integer> {

}
