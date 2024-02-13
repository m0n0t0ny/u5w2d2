package antoniobertuccio.u5w2d2.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {
  private int id;
  private String name;
  private String surname;
  private String email;
  private String dateOfBirth;
  private String avatar;
}
