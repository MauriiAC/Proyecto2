import java.time.LocalDate;
import java.time.Period;

public class Main {
  public static void main(String[] args) {

    Perro perro1 = new Perro("Cachito", "chiwawa", 10);

    Persona persona1 = new Persona("Mauricio", "Cuello", LocalDate.of(1991, 1, 11), 1000, perro1);
    Persona persona2 = new Persona("Lionel", "Messi", LocalDate.of(1988, 6, 17), 800);

    System.out.println(persona1.saluda());
    System.out.println(persona2.saluda());

  }
}