package fr.uha.miage.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.uha.miage.project.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByPseudoAndPassword(String pseudo, String password);
	User findByPseudo(String pseudo);
	List<User> findByName(String name);
	User findById(int id);
}
