import java.time.LocalTime;

public class Main {
  public static void main(String[] args) {

    // Perro perro1 = new Perro("Cachito", "chiwawa", 10);

    Persona persona1 = new Empleado("Mauricio", "Cuello", 32, "30123321", 1000, LocalTime.of(10, 30));
    Empleado empleado1 = new Empleado("Lionel", "Messi", 35, "28111222", 2200, LocalTime.of(6, 50));
    Seguridad seguridad1 = new Seguridad("Cristiano", "Ronaldo", 38, "25012345", 2000, LocalTime.of(6, 30), "Fiat 600", "M14");

    // empleado1.setEstado(Empleado.EstadoEmpleado.ACTIVO);
    empleado1.setEstado("INACTIVO");
    System.out.println("El empleado está en estado " + empleado1.getEstado());
    System.out.println("El empleado está en estado " + empleado1.getEstado().getNum());


    // Persona[] saludadores = { persona1, empleado1, seguridad1 };

    // for (Persona p : saludadores) {
    //   System.out.println(p.saluda());
    // }

    // Seguridad seguridad2 = (Seguridad) saludadores[2];

    // System.out.println(seguridad2.llamarPolicia("están robando el edificioooo!!"));
    // System.out.println(((Seguridad) saludadores[2]).llamarPolicia("están robando el edificioooo!!"));

  }
}