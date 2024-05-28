package author.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Data
public class Book {
	
		
	
	   
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String publicationDate;
	    private double price;

	    @ManyToOne
	    @EqualsAndHashCode.Exclude
	    @ToString.Exclude
	    @JoinColumn(name = "author_id")
	    private Author author;
	    		
		   

}
