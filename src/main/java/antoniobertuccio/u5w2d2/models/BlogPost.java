package antoniobertuccio.u5w2d2.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
  private int id;
  private String category;
  private String title;
  private String cover;
  private String body;
  private int readingTime;
}
