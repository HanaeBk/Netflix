package Repository;

import org.springframework.data.repository.CrudRepository;

import Model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
