package Repository;

import org.springframework.data.repository.CrudRepository;

import Model.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
