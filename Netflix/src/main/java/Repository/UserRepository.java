package Repository;

import org.springframework.data.repository.CrudRepository;

import Model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
