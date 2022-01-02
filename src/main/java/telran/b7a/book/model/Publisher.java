package telran.b7a.book.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "publisherName" })
@Entity
public class Publisher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3674083226235754750L;

	@Id
	String publisherName;
	@OneToMany(mappedBy = "publisher")
	Set<Book> books;

	public Publisher(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return publisherName;
	}

}
