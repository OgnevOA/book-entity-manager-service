package telran.b7a.book.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.b7a.book.model.Author;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public Optional<Author> findById(String id) {
		return Optional.ofNullable(em.find(Author.class, id));
	}

	@Override
	public Author save(Author author) {
		em.persist(author);
		return author;
	}

	@Override
	public void delete(Author author) {
		em.remove(author);
	}

}
