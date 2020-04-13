package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sp on 2020-04-12
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
