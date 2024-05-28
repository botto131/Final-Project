package author.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Data

public class Genre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreId;

    private String name;
    private String description;
    
    @EqualsAndHashCode.Exclude
    @ToString.Exclude    
    @ManyToMany(mappedBy = "genre", cascade = CascadeType.PERSIST)
    Set<Author> authors = new HashSet<>();
    
    
}

    
    
    
    
    
