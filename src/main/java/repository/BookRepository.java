package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import author.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>  {

}
