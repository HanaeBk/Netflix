package fr.uha.miage.project.Repository;

import org.springframework.data.repository.CrudRepository;

import fr.uha.miage.project.Model.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
