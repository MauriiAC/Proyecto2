import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Seguridad {
  private String nombre;
  private String apellido;
  private int edad;
  private String dni;
  private int sueldo;
  private LocalTime horario;
  private String vehiculo;
  private String arma;

  public Seguridad(String nombre, String apellido, int edad, String dni, int sueldo, LocalTime horario, String vehiculo, String arma) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.dni = dni;
    this.sueldo = sueldo;
    this.horario = horario;
    this.vehiculo = vehiculo;
    this.arma = arma;
  }

  public String saluda() {
    return String.format("Hola, me llamo %s %s", this.nombre, this.apellido);
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

  public String llamarPolicia(String mensaje) {
    return String.format("Estoy llamando a la policía y le digo que %s", mensaje);
  }
}
