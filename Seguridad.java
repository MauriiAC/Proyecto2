import java.time.LocalTime;

public class Seguridad extends Empleado {
  private String vehiculo;
  private String arma;

  public Seguridad(String nombre, String apellido, int edad, String dni, int sueldo, LocalTime horario, String vehiculo, String arma) {
    super(nombre, apellido, edad, dni, sueldo, horario);
    this.vehiculo = vehiculo;
    this.arma = arma;
  }

  public String llamarPolicia(String mensaje) {
    return String.format("Estoy llamando a la policía y le digo que %s", mensaje);
  }
}
