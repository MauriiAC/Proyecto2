import java.time.LocalDate;
import java.time.Period;

public abstract class Persona implements CharSequence {

  private String nombre;
  private String apellido;
  private int edad;
  private String dni;

  public Persona(String nombre, String apellido, int edad, String dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.dni = dni;
  }

  public abstract String saluda();
  // public String saluda() {
  //   return String.format("Hola, me llamo %s %s", this.nombre, this.apellido);
  // }

  public String getNombre() {
    return nombre;
  }

  public String getDni() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }

  public String getApellido() {
    return apellido;
  }

  public int length() {
    return this.nombre.length();
  }

  @Override
  public char charAt(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'charAt'");
  }

  @Override
  public CharSequence subSequence(int arg0, int arg1) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subSequence'");
  }

  // public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int meta, Perro perro) {
  //   this.nombre = nombre;
  //   this.apellido = apellido;
  //   this.fechaNacimiento = fechaNacimiento;
  //   this.meta = meta;
  //   this.perro = perro;
  // }

  // public int getEdadEnAgnos() {

  //   Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
  //   return periodo.getYears();
  // }

  // public void setMeta(int meta) {
  //   this.meta = meta;
  // }

  // public String saluda() {

  //   if (this.perro != null) {
  //     return String.format("Hola, mi nombre es %s %s y tengo un %s de %s años.", this.nombre, this.apellido,
  //         this.perro.getRaza(), this.perro.getEdad());      
  //   } else {      
  //     return String.format("Hola, mi nombre es %s %s y no tengo mascota.", this.nombre, this.apellido);
  //   }

  // }

  // public String caminar(int pasosDados) {
  //   if (pasosDados >= this.meta) {
  //     return "Felicitaciones! cumpliste tu meta diaria";
  //   } else {
  //     return "No cumpliste tu meta, ponete las pilas!";
  //   }
  // }

}