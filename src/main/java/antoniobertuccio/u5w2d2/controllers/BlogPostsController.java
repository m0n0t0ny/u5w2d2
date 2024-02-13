package antoniobertuccio.u5w2d2.controllers;

import antoniobertuccio.u5w2d2.models.BlogPost;
import antoniobertuccio.u5w2d2.services.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostsController {

  @Autowired
  private BlogPostsService BlogPostsService;

  @GetMapping
  public List<BlogPost> getAllBlogPosts() {
    return this.BlogPostsService.getBlogPosts();
  }

  @PostMapping
  public BlogPost saveBlogPost(@RequestBody BlogPost newBlogPost) {
    return this.BlogPostsService.saveBlogPost(newBlogPost);
  }

  @GetMapping("/{id}")
  public BlogPost findById(@PathVariable int id) {
    return this.BlogPostsService.findById(id);
  }

  @PutMapping("/{id}")
  public BlogPost findByIdAndUpdate(@PathVariable int id, @RequestBody BlogPost updateBlogPost) {
    return this.BlogPostsService.findByIdAndUpdate(id, updateBlogPost);
  }

  @DeleteMapping("/{id}")
  public void deleteBlogPost(@PathVariable int id) {
    this.BlogPostsService.deleteBlogPost(id);
  }
}
