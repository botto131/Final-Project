package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import author.entity.AuthorGenre;

public interface AuthorGenreRepository extends JpaRepository<AuthorGenre, Long> {

}
