public class Perro {

  private String nombre;
  private String raza;
  private int edad;
  private static int numPatas = 4;

  public Perro(String nombre, String raza, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public int getEdad() {
    return edad;
  }

  public static int getNumPatas() {
    return Perro.numPatas;
  }

}
