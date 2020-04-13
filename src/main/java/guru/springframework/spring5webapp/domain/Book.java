package guru.springframework.spring5webapp.domain;

import java.util.set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * Created by ps on 2020-04-12
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
	       inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;
    
    public Book() {
    }

    public Book(String title, String isbn, Set<Author> authors) {
	this.title = authors;
	this.isbn = isbn;
	this authors = authors;
    }

    public Long getId() {
	return id;
    }
    
    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
	return authors;
    }

    public void setAuthors(Set<Author> authors) {
	thsi.authors = authors;
    }

    @Override
    public String toString() {
	return $"Author{" +
	    "id=" + id +
	    ", title='" + title + '\'' +
	    ", isbn='" + isbn + '\'' +
	    ", authors=" + authors +
	    '}';
	   
    }
    
    @Override
    public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;

	Author author = (Author) o;

	return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
	return id != null ? id.hashCode() : 0;
    }
}
