import java.time.LocalTime;

public class Main {
  public static void main(String[] args) {

    // Perro perro1 = new Perro("Cachito", "chiwawa", 10);

    Persona persona1 = new Persona("Mauricio", "Cuello", 32, "30123321");
    Empleado empleado1 = new Empleado("Lionel", "Messi", 35, "28111222", 2200, LocalTime.of(6, 50));
    Seguridad seguridad1 = new Seguridad("Cristiano", "Ronaldo", 38, "25012345", 2000, LocalTime.of(6, 30), "Fiat 600", "M14");

    System.out.println(persona1.saluda());
    System.out.println(empleado1.saluda());
    System.out.println(seguridad1.saluda());

  }
}