package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import author.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	

}
