
public class Main {
  public static void main(String[] args) {

    Persona persona1 = new Persona("Mauricio", "Cuello", 32);
    Persona persona2 = new Persona("Lionel", "Messi", 35);

    persona1.nombre = "Mauri";

    System.out.println(persona1.saluda());
    System.out.println(persona2.saluda());

    // System.out.println(persona1.nombre);
    // System.out.println(persona1.apellido);
    
  }
}

class Persona {

  String nombre;
  String apellido;
  int edad;

  public Persona(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public String saluda() {
    
    return String.format("Hola, mi nombre es %s %s", this.nombre, this.apellido);
  }
  
}