package antoniobertuccio.u5w2d2.services;

import antoniobertuccio.u5w2d2.exceptions.NotFoundException;
import antoniobertuccio.u5w2d2.models.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorsService {
  private List<Author> authors = new ArrayList<>();
  private int nextId = 1;

  public List<Author> getAuthors(){
    return this.getAuthors();
  }

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

//  public BlogPost saveUser(BlogPost newBlogPost){
//    Random rndm = new Random();
//    newBlogPost.setId(rndm.nextInt(1, 100000));
//    this.blogPosts.add(newBlogPost);
//    return newBlogPost;
//  }

//  public BlogPost findById(int id) {
//    BlogPost found = null;
//    for (BlogPost blogPost : this.blogPosts) {
//      if (blogPost.getId() == id) {
//        found = blogPost;
//      }
//    }
//    if (found == null) throw new NotFoundException(id);
//    else return found;
//  }
//
//  public BlogPost findByIdAndUpdate(int id, BlogPost updateBlogPost) {
//    BlogPost found = null;
//    for (BlogPost blogPost : this.blogPosts) {
//      if (blogPost.getId() == id) {
//        found = blogPost;
//        found.setName((updateBlogPost.getName()));
//        found.setName((updateBlogPost.getSurname()));
//      }
//    }
//    if (found == null) throw new NotFoundException(id);
//    else return found;
//  }
}
