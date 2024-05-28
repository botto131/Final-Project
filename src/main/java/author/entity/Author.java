package author.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Data
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long authorId; 
	
	private String name; 
	private String biography;
	
	@EqualsAndHashCode.Exclude
    @ToString.Exclude
    
    @OneToMany(mappedBy = "author_id", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Book> books = new HashSet<>();
	 @EqualsAndHashCode.Exclude
	    @ToString.Exclude
	    @ManyToMany(cascade = CascadeType.PERSIST)
	    
	    @JoinTable(name = "author_genre", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	    Set<Genre> genres = new HashSet<>();
	

	
	

}
