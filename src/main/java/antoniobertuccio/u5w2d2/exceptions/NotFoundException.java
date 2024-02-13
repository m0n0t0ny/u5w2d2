package antoniobertuccio.u5w2d2.exceptions;

public class NotFoundException extends RuntimeException{
  public NotFoundException(int id) {
    super("Nessun elemento con id '" + id + "' è stato trovato.");
  }
}
