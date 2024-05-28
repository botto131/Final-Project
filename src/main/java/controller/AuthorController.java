package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import author.entity.Author;
import repository.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository AuthorRepository;

    @GetMapping("/")
    public List<Author> getAllAuthors() {
        return AuthorRepository.findAll();
    }

    @PostMapping("/")
    public Author createAuthor(@RequestBody Author author) {
        return AuthorRepository.save(author);
    }

}
