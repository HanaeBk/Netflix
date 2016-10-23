package fr.uha.miage.project.Repository;

import org.springframework.data.repository.CrudRepository;

import fr.uha.miage.project.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
