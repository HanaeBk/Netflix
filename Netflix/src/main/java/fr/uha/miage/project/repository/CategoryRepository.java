package fr.uha.miage.project.repository;

import org.springframework.data.repository.CrudRepository;

import fr.uha.miage.project.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
