package guru.spring.framework.spring5webapp.domain;

import java.util.set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

/**
 * Created by ps on 2020-04-12
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Author() {
    }

    public Author(String firstName, String lastName, Set<Book> books) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.books = books;
    }

    public Long getId() {
	return id;
    }
    
    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }
    
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public Set<Book> getBooks() {
	return books;
    }

    public void setBooks(Set<Book> books) {
	this.books = books;
    }
}
