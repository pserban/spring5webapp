package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sp on 2020-04-12
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
