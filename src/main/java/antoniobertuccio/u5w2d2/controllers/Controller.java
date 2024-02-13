package antoniobertuccio.u5w2d2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
  @GetMapping
  public String allAccess() {
    return "Welcome to day 2, week 2 of unit 5 💪" +
            "\nRESTful API with Spring Web" +
            "\nby Antonio Bertuccio (©2024)" +
            "\n" +
            "\nAvailable endpoints" +
            "\n- Authors: /authors" +
            "\n- BlogPosts: /blogPosts";
  }
}
