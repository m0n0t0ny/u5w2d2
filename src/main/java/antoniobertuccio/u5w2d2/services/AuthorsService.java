package antoniobertuccio.u5w2d2.services;

import antoniobertuccio.u5w2d2.exceptions.NotFoundException;
import antoniobertuccio.u5w2d2.models.Author;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AuthorsService {
  @Getter
  private List<Author> authors = new ArrayList<>();
  private int nextId = 1;

  public Author saveAuthor(Author newAuthor) {
    newAuthor.setId(nextId);
    nextId++;
    this.authors.add(newAuthor);
    return newAuthor;
  }

  public Author findById(int id) {
    for (Author author : this.authors) {
      if (author.getId() == id) {
        return author;
      }
    }
    throw new NotFoundException(id);
  }

  public Author findByIdAndUpdate(int id, Author updateAuthor) {
    Author found = null;
    for (Author author : this.authors) {
      if (author.getId() == id) {
        found = author;
        found.setName(updateAuthor.getName());
        found.setSurname(updateAuthor.getSurname());
      }
    }
    if (found == null) {
      throw new NotFoundException(id);
    } else {
      return found;
    }
  }

  public void deleteAuthor(int id) {
    Iterator<Author> iterator = authors.iterator();
    while (iterator.hasNext()) {
      Author author = iterator.next();
      if (author.getId() == id) {
        iterator.remove();
      }
    }
  }
}
