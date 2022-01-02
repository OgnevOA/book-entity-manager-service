package telran.b7a.book.dao;

import java.util.Optional;

import telran.b7a.book.model.Author;

public interface AuthorRepository {
	
	Optional<Author> findById(String id);
	
	Author save(Author author);

	void delete(Author author);

}
