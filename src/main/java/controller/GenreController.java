package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import author.entity.Genre;
import repository.GenreRepository;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/")
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @PostMapping("/")
    public Genre createGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

}
