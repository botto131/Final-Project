package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import author.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>  {

}
