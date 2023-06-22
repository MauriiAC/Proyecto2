import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Persona persona1 = new Empleado("Mauricio", "Cuello", 32, "30123321", 1000,
    // LocalTime.of(10, 30));
    // Empleado empleado1 = new Empleado("Lionel", "Messi", 35, "28111222", 2200,
    // LocalTime.of(6, 50));
    // Seguridad seguridad1 = new Seguridad("Cristiano", "Ronaldo", 38, "25012345",
    // 2000, LocalTime.of(6, 30), "Fiat 600", "M14");

    Scanner scanner = new Scanner(System.in);

    BufferedReader br = null;
    try {
      leerArchivo("archivoExterno.txt");
      // br = new BufferedReader(new FileReader("archivoExterno.txt"));
      // String linea;
      // while ((linea = br.readLine()) != null) {
      //   System.out.println(linea);
      // }
      // br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Ejecutando más lineas de código...");

    scanner.close();
  }

  public static double calcularIMC(int peso, double altura) {
    if (peso <= 0) {
      throw new IllegalArgumentException("El peso debe ser un número positivo");
    }
    if (altura <= 0) {
      throw new IllegalArgumentException("La altura debe ser un número positivo");
    }
    return peso / Math.pow(altura, 2);

  }

  public static void imprimirLongitud(Object objeto) {

    if (objeto instanceof CharSequence) {
      CharSequence secuencia = (CharSequence) objeto;
      int longitud = secuencia.length();
      System.out.println("Longitud: " + longitud);
    } else {
      System.out.println("El objeto no implementa length");
    }
  }

}