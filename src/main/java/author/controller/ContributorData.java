package author.controller;

import java.util.HashSet;
import java.util.Set;

import author.entity.Book;
import author.entity.Genre;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
public class ContributorData {
private Long authorId; 
	
	private String name; 
	private String biography;
	
	    
    Set<Book> books = new HashSet<>();
	    Set<Genre> genres = new HashSet<>();

}
