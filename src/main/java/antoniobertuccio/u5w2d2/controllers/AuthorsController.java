package antoniobertuccio.u5w2d2.controllers;

import antoniobertuccio.u5w2d2.models.Author;
import antoniobertuccio.u5w2d2.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
//  @GetMapping
//  public String authors() {
//    return "You're accessing the 'authors' endpoint.\n📖 Browse it using:\n- GET requests = /testGet\n- POST requests = /testPost\n- PUT requests = /testPut\n- DELETE requests = /testDelete";
//  }

  @Autowired
  private AuthorsService authorsService;

  @GetMapping
  public List<Author> getAllAuthors() {
    return this.authorsService.getAuthors();
  }

  @PostMapping
  public Author saveAuthor(@RequestBody Author newAuthor) {
    return this.authorsService.saveAuthor(newAuthor);
  }

  @GetMapping("/{id}")
  public Author findById(@PathVariable int id) {
    return this.authorsService.findById(id);
  }

  @PutMapping("/{id}")
  public Author findByIdAndUpdate(@PathVariable int id, @RequestBody Author updateAuthor) {
    return this.authorsService.findByIdAndUpdate(id, updateAuthor);
  }

  @DeleteMapping("/{id}")
  public void deleteAuthor(@PathVariable int id) {
    this.authorsService.deleteAuthor(id);
  }
}
