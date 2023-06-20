import java.time.LocalDate;
import java.time.Period;

public class Persona {

  String nombre;
  String apellido;
  private LocalDate fechaNacimiento;
  int meta;
  Perro perro;

  public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int meta) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.meta = meta;
  }

  public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int meta, Perro perro) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.meta = meta;
    this.perro = perro;
  }

  public int getEdadEnAgnos() {

    Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
    return periodo.getYears();
  }

  public void setMeta(int meta) {
    this.meta = meta;
  }

  public String saluda() {

    if (this.perro != null) {
      return String.format("Hola, mi nombre es %s %s y tengo un %s de %s años.", this.nombre, this.apellido,
          this.perro.getRaza(), this.perro.getEdad());      
    } else {      
      return String.format("Hola, mi nombre es %s %s y no tengo mascota.", this.nombre, this.apellido);
    }

  }

  public String caminar(int pasosDados) {
    if (pasosDados >= this.meta) {
      return "Felicitaciones! cumpliste tu meta diaria";
    } else {
      return "No cumpliste tu meta, ponete las pilas!";
    }
  }

}