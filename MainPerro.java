class Perro {

  String nombre;
  String raza;
  int edad;
  static int numPatas = 4;

  public Perro(String nombre, String raza, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public static int getNumPatas() {
    return Perro.numPatas;
  }

}

public class MainPerro {
  
  public static void main(String[] args) {
    
    Perro perro1 = new Perro("Aura", "caniche", 5);
    Perro perro2 = new Perro("Cacho", "dalmata", 2);

    System.out.println(Perro.getNumPatas());
  }

}


