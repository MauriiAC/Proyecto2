import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Empleado extends Persona implements IEmpleado {
  private int sueldo;
  private LocalTime horario;
  private EstadoEmpleado estado;

  public enum EstadoEmpleado {
    ACTIVO(1),
    INACTIVO(2),
    LICENCIA(3),
    VACACIONES(4);

    private int estado;

    EstadoEmpleado(int estado){
      this.estado = estado;
    }

    public int getNum() {
      return this.estado;
    }
  }

  public Empleado(String nombre, String apellido, int edad, String dni, int sueldo, LocalTime horario) {
    super(nombre, apellido, edad, dni);
    this.sueldo = sueldo;
    this.horario = horario;
  }

  public void setEstado(EstadoEmpleado estado) {
    this.estado = estado;
  }

  public void setEstado(String estado) {
    this.estado = EstadoEmpleado.valueOf(estado);
  }

  public EstadoEmpleado getEstado() {
    return estado;
  }

  @Override
  public String saluda() {
    
    return String.format("Hola, me llamo %s %s y gano %s", this.getNombre(), this.getApellido(), this.sueldo);
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
