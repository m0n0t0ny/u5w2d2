package antoniobertuccio.u5w2d2.services;

import antoniobertuccio.u5w2d2.exceptions.NotFoundException;
import antoniobertuccio.u5w2d2.models.Author;
import antoniobertuccio.u5w2d2.models.BlogPost;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BlogPostsService {
  @Getter
  private List<BlogPost> blogPosts = new ArrayList<>();
  private int nextId = 1;

  public BlogPost saveBlogPost(BlogPost newBlogPost) {
    newBlogPost.setId(nextId);
    nextId++;
    this.blogPosts.add(newBlogPost);
    return newBlogPost;
  }

  public BlogPost findById(int id) {
    for (BlogPost blogPost : this.blogPosts) {
      if (blogPost.getId() == id) {
        return blogPost;
      }
    }
    throw new NotFoundException(id);
  }

  public BlogPost findByIdAndUpdate(int id, BlogPost updateBlogPost) {
    BlogPost found = null;
    for (BlogPost blogPost : this.blogPosts) {
      if (blogPost.getId() == id) {
        found = blogPost;
        found.setCategory(updateBlogPost.getCategory());
        found.setTitle(updateBlogPost.getTitle());
        found.setCover(updateBlogPost.getCover());
        found.setBody(updateBlogPost.getBody());
        found.setReadingTime(updateBlogPost.getReadingTime());
      }
    }
    if (found == null) {
      throw new NotFoundException(id);
    } else {
      return found;
    }
  }

  public void deleteBlogPost(int id) {
    Iterator<BlogPost> iterator = blogPosts.iterator();
    while (iterator.hasNext()) {
      BlogPost blogPost = iterator.next();
      if (blogPost.getId() == id) {
        iterator.remove();
        return;
      }
    }
    throw new NotFoundException(id);
  }
}
