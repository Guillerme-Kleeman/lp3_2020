package unae.lp3.notas.repository;

import org.springframework.data.repository.CrudRepository;

import unae.lp3.notas.model.Nota;

public interface NotasRepository extends CrudRepository<Nota, Integer> {

}
