package fr.uha.miage.project.repository;

import org.springframework.data.repository.CrudRepository;

import fr.uha.miage.project.model.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {

}
