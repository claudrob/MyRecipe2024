package my.edu.MyRecipe2024.repositories;

import my.edu.MyRecipe2024.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Long> {

}
