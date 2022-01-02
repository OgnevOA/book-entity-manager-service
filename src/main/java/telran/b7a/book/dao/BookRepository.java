package telran.b7a.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.b7a.book.model.Book;

public interface BookRepository {

	Stream<Book> findByAuthorsName(String author);
	
	Stream<Book> findByPublisherPublisherName(String publisherName);

	boolean existsById(String isbn);
	
	Book save(Book book);

	Optional<Book> findById(String id);

	void delete(Book book);
	
	void delete(String isbn);

}
