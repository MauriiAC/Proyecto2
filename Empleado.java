import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Empleado extends Persona {
  private int sueldo;
  private LocalTime horario;

  public Empleado(String nombre, String apellido, int edad, String dni, int sueldo, LocalTime horario) {
    super(nombre, apellido, edad, dni);
    this.sueldo = sueldo;
    this.horario = horario;
  }

  public void fichar(LocalTime llegada) {
    
    long minutosDiferencia = llegada.until(this.horario, ChronoUnit.MINUTES);

    if (minutosDiferencia < 0) {
      System.out.println("Llegó " + Math.abs(minutosDiferencia) + " minutos tarde");
    } else if (minutosDiferencia > 0) {
      System.out.println("Llegó " + minutosDiferencia + " minutos temprano");      
    } else {
      System.out.println("Llegó a tiempo");
    }
  }

}
