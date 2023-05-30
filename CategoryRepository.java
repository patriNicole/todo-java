package ch.cern.todo;
import org.springframework.data.repository.CrudRepository;

// It provides CRUD (Create, Read, Update, Delete) operations
// queries for interacting with the database
public interface CategoryRepository extends CrudRepository<Category, Long> {
}

